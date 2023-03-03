package com.example.groupwalkapi.service;

import com.example.groupwalkapi.repository.GuildWalkRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GuildWalkService {
    private final GuildWalkRepository groupWalkRepo;
    @Autowired
    public GuildWalkService(GuildWalkRepository groupWalkRepo) {
        this.groupWalkRepo = groupWalkRepo;
    }


}
