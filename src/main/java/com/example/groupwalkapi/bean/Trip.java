package com.example.groupwalkapi.bean;

import com.example.groupwalkapi.beaninfo.RouteInfo;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Trip {
    private GuildWalk groupWalk;
    private RouteInfo routeInfo;
}
