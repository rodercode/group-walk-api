package com.example.groupwalkapi.service;

import com.example.groupwalkapi.repository.GroupWalkRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GroupWalkService {
    private final GroupWalkRepository groupWalkRepo;
    @Autowired
    public GroupWalkService(GroupWalkRepository groupWalkRepo) {
        this.groupWalkRepo = groupWalkRepo;
    }


}
