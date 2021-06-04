package app.mapper;

import app.domain.Route;
import app.dto.RouteDto;

import java.util.List;

public interface RouteMapper {

    Route fromDto(RouteDto routeDto);

    RouteDto toDto(Route route);

    List<Route> fromDtoList(List<RouteDto> routeDtoList);

    List<RouteDto> toDtoList(List<Route> routeList);
}
