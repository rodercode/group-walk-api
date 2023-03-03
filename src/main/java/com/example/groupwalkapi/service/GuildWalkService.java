package com.example.groupwalkapi.service;

import com.example.groupwalkapi.bean.GuildWalk;
import com.example.groupwalkapi.exception.ListEmptyException;
import com.example.groupwalkapi.repository.GuildWalkRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GuildWalkService {
    private final GuildWalkRepository guildWalkRepo;
    @Autowired
    public GuildWalkService(GuildWalkRepository guildWalkRepo) {
        this.guildWalkRepo = guildWalkRepo;
    }

    // Create GuildWalk
    public void createGuildWalk(GuildWalk guildWalk){
        guildWalkRepo.save(guildWalk);
    }
    // get guildWalks
    public List<GuildWalk> getGuildWalks(){
        if (guildWalkRepo.findAll().isEmpty())
            throw new ListEmptyException("no guild walks exist in database");
        return guildWalkRepo.findAll();
    }
}



















