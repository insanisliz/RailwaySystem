package app.mapper.impl;

import app.mapper.RouteMapper;
import app.domain.Route;
import app.dto.RouteDto;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class RouteMapperImpl implements RouteMapper {
    @Override
    public Route fromDto(RouteDto routeDto) {
        return Route.builder()
                .id(routeDto.getId())
                .name(routeDto.getName())
                .lengthInKm(routeDto.getLengthInKm())
                .startTime(routeDto.getStartTime())
                .departurePoint(routeDto.getDeparturePoint())
                .intermediateStations(routeDto.getIntermediateStations())
                .destinationPoint(routeDto.getDestinationPoint())
                .stopPoints(routeDto.getStopPoints())
                .build();
    }

    @Override
    public RouteDto toDto(Route route) {
        return RouteDto.builder()
                .id(route.getId())
                .name(route.getName())
                .lengthInKm(route.getLengthInKm())
                .startTime(route.getStartTime())
                .departurePoint(route.getDeparturePoint())
                .intermediateStations(route.getIntermediateStations())
                .destinationPoint(route.getDestinationPoint())
                .stopPoints(route.getStopPoints())
                .build();
    }

    @Override
    public List<Route> fromDtoList(List<RouteDto> routeDtoList) {
        List<Route> routeList = new ArrayList<>();
        for (RouteDto routeDto:
               routeDtoList) {
            routeList.add(fromDto(routeDto));
        }
        return routeList;
    }

    @Override
    public List<RouteDto> toDtoList(List<Route> routeList) {
        List<RouteDto> routeDtoList = new ArrayList<>();
        for (Route route:
                routeList) {
           routeDtoList.add(toDto(route));
        }
        return routeDtoList;
    }
}
