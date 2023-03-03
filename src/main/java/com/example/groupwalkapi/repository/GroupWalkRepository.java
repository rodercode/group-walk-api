package com.example.groupwalkapi.repository;

import com.example.groupwalkapi.bean.GroupWalk;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GroupWalkRepository extends JpaRepository<GroupWalk,Long> {

}
