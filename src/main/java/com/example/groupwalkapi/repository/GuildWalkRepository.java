package com.example.groupwalkapi.repository;

import com.example.groupwalkapi.bean.GuildWalk;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GuildWalkRepository extends JpaRepository<GuildWalk,Long> {

}
