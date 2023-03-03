package com.example.groupwalkapi.beaninfo;
import lombok.*;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class RouteInfo {
    private long id;
    private String startLocation;
    private String endLocation;
    private int travelTime;
}
