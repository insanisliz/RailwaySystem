package app.rest;


import app.dto.RouteDto;
import app.service.RouteService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/routes")
public class RouteController {

    private RouteService routeService;

    public RouteController(RouteService routeService) {
        this.routeService = routeService;
    }

    @PostMapping
    public void add(@RequestBody RouteDto routeDto) {
        routeService.add(routeDto);
    }

    @GetMapping("/{id}")
    public RouteDto getRouteById(@PathVariable("id") Long id) {
        return routeService.findById(id);
    }

    @GetMapping
    public List<RouteDto> getRoutes() {
        return routeService.findAll();
    }

    @PutMapping
    public void update(@RequestBody RouteDto routeDto) {
        routeService.update(routeDto);
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable("id") Long id) {
        routeService.deleteById(id);
    }
}
