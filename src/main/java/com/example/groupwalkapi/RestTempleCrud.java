package com.example.groupwalkapi;

import com.example.groupwalkapi.beaninfo.RouteInfo;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import java.util.List;

public class RestTempleCrud {
    public List<RouteInfo> getRoutes(RestTemplate restTemplate) {
        ResponseEntity<List<RouteInfo>> response = restTemplate.exchange(
                "https://microservice-enskild-trafik-enskild-trafik.azuremicroservices.io/routes/car",
                HttpMethod.GET,
                null,
                new ParameterizedTypeReference<>() {
                });
        return response.getBody();
    }
}
