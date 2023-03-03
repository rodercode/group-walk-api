package com.example.groupwalkapi.bean;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.apache.hc.client5.http.RouteInfo;

@NoArgsConstructor
@AllArgsConstructor
@Getter @Setter
@Entity(name = "group_walks")
public class GroupWalk {
    @Id
    @GeneratedValue
    private Long id;
    private int members;
    private RouteInfo routeInfo;
}
