package com.example.groupwalkapi.bean;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@NoArgsConstructor
@AllArgsConstructor
@Getter @Setter
@Entity(name = "guild_walks")
public class GuildWalk {
    @Id
    @GeneratedValue

    @Column(name = "id",nullable = false)
    private Long id;

    @Column(name = "name",nullable = false)
    private String name;

    @Column(name = "members",nullable = false)
    private int members;

    @Column(name = "time")
    private int time;

    @Column(name = "route_id")
    private Long routeId;
}
