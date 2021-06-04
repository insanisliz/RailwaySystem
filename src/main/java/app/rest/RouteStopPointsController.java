package app.rest;

import app.service.RouteWithTrainStopPointsService;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class RouteStopPointsController {

    private RouteWithTrainStopPointsService routeWithTrainStopPoints;

    public RouteStopPointsController(RouteWithTrainStopPointsService routeWithTrainStopPoints) {
        this.routeWithTrainStopPoints = routeWithTrainStopPoints;
    }

    @PostMapping("/add/{route_id}/{stop_point_id}")
    public void addStopPoint(@PathVariable("route_id") Long routeId, @PathVariable("stop_point_id") Long stopPointId) {
        routeWithTrainStopPoints.addTrainStopPoint(routeId, stopPointId);
    }

    @DeleteMapping("/delete/{route_id}/{stop_point_id}")
    public void deleteStopPoint(@PathVariable("route_id") Long routeId, @PathVariable("stop_point_id") Long stopPointId) {
        routeWithTrainStopPoints.deleteTrainStopPoint(routeId, stopPointId);
    }
}
