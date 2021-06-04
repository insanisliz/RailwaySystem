package app.service.impl;

import app.domain.Route;
import app.mapper.RouteMapper;
import app.dto.RouteDto;
import app.repository.RouteRepository;
import app.service.RouteService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

@Service
public class RouteServiceImpl implements RouteService {

    private RouteRepository routeRepository;
    private RouteMapper routeMapper;

    public RouteServiceImpl(RouteRepository routeRepository, RouteMapper routeMapper) {
        this.routeRepository = routeRepository;
        this.routeMapper = routeMapper;
    }

    public void add(RouteDto routeDto) {
        routeRepository.save(routeMapper.fromDto(routeDto));
    }

    public RouteDto findById(Long id) {
        Optional<Route> route = routeRepository.findById(id);
        if (route.isPresent()) {
            return routeMapper.toDto(route.get());
        } else {
            throw new NoSuchElementException("No route with id = " + id);
        }
    }

    public List<RouteDto> findAll() {
        return routeMapper.toDtoList(routeRepository.findAll());
    }

    public void update(RouteDto routeDto) {
        routeRepository.save(routeMapper.fromDto(routeDto));
    }

    public void deleteById(Long id) {
        routeRepository.deleteById(id);
    }
}
