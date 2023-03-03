package com.example.groupwalkapi.bean;
import com.example.groupwalkapi.beaninfo.RouteInfo;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class GuildTrip {

    private GuildWalk guildWalk;
    private RouteInfo routeInfo;

    public GuildTrip(GuildWalk guildWalk, RouteInfo routeInfo) {
        this.guildWalk = guildWalk;
        this.routeInfo = routeInfo;
    }
}
