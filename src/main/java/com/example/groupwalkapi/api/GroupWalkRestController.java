package com.example.groupwalkapi.api;

import com.example.groupwalkapi.service.GroupWalkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GroupWalkRestController {
    private final GroupWalkService groupWalkService;
    @Autowired
    public GroupWalkRestController(GroupWalkService groupWalkService) {
        this.groupWalkService = groupWalkService;
    }
}
