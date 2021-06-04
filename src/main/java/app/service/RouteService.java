package app.service;


import app.dto.RouteDto;

import java.util.List;

public interface RouteService {

    void add(RouteDto routeDto);

    RouteDto findById(Long id);

    List<RouteDto> findAll();

    void update(RouteDto routeDto);

    void deleteById(Long id);
}
