package com.example.groupwalkapi.api;

import com.example.groupwalkapi.service.GuildWalkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GuildWalkRestController {
    private final GuildWalkService groupWalkService;
    @Autowired
    public GuildWalkRestController(GuildWalkService groupWalkService) {
        this.groupWalkService = groupWalkService;
    }
}
