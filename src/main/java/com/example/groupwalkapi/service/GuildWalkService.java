package com.example.groupwalkapi.service;

import com.example.groupwalkapi.bean.GuildWalk;
import com.example.groupwalkapi.repository.GuildWalkRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
}



















