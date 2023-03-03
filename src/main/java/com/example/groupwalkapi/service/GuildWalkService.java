package com.example.groupwalkapi.service;

import com.example.groupwalkapi.RestTempleCrud;
import com.example.groupwalkapi.bean.GuildTrip;
import com.example.groupwalkapi.bean.GuildWalk;
import com.example.groupwalkapi.beaninfo.RouteInfo;
import com.example.groupwalkapi.exception.ListEmptyException;
import com.example.groupwalkapi.repository.GuildWalkRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
public class GuildWalkService {
    private final GuildWalkRepository guildWalkRepo;
    private RestTemplate restTemplate;
    private final RestTempleCrud restTempleCrud = new RestTempleCrud();

    @Autowired
    public GuildWalkService(GuildWalkRepository guildWalkRepo, RestTemplate restTemplate) {
        this.guildWalkRepo = guildWalkRepo;
        this.restTemplate = restTemplate;
    }


    // Create GuildWalk
    public void createGuildWalk(GuildWalk guildWalk) {
        guildWalkRepo.save(guildWalk);
    }

    // get guildWalk
    public GuildWalk getGuildWalk(Long guildWalkId) {
        return guildWalkRepo.findById(guildWalkId).get();
    }

    // get guildWalks
    public List<GuildWalk> getGuildWalks() {
        if (guildWalkRepo.findAll().isEmpty())
            throw new ListEmptyException("no guild walks exist in database");
        return guildWalkRepo.findAll();
    }


    // Create GuildTrip
    public void assigneGuildWalkARoute(Long guildWalkId, Long routeId){
        GuildWalk guildWalk = guildWalkRepo.findById(guildWalkId).get();
        guildWalk.setRouteId(routeId);
        guildWalkRepo.save(guildWalk);
    }

    public GuildTrip getGuildTrip(Long guildWalkId, Long routeId) {
        RouteInfo route = restTempleCrud.getRoutes(restTemplate).get(routeId.intValue()-1);
        GuildWalk guildWalk = guildWalkRepo.findById(guildWalkId).get();
        return new GuildTrip(guildWalk, route);
    }

}



















