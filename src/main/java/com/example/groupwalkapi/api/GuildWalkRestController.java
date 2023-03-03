package com.example.groupwalkapi.api;

import com.example.groupwalkapi.bean.GuildWalk;
import com.example.groupwalkapi.service.GuildWalkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("guild-walks")
public class GuildWalkRestController {
    private final GuildWalkService guildWalkService;
    @Autowired
    public GuildWalkRestController(GuildWalkService guildWalkService) {
        this.guildWalkService = guildWalkService;
    }
    @PostMapping
    private ResponseEntity<GuildWalk> createGuildWalk(@RequestBody GuildWalk guildWalk){
        guildWalkService.createGuildWalk(guildWalk);
        return new ResponseEntity<>(guildWalk, HttpStatus.CREATED);
    }
}
