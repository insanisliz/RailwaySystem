package app.service.impl;

import app.domain.RouteWithTrainStopPoints;
import app.repository.RouteWithTrainStopPointsRepository;
import app.service.RouteWithTrainStopPointsService;
import org.springframework.stereotype.Service;

@Service
public class RouteWithTrainStopPointsServiceImpl implements RouteWithTrainStopPointsService {

    private RouteWithTrainStopPointsRepository routeWithTrainStopPointsRepository;

    public RouteWithTrainStopPointsServiceImpl(RouteWithTrainStopPointsRepository routeWithTrainStopPointsRepository) {
        this.routeWithTrainStopPointsRepository = routeWithTrainStopPointsRepository;
    }

    @Override
    public void addTrainStopPoint(Long routeId, Long trainStopPointId) {
        RouteWithTrainStopPoints routeWithTrainStopPoints = new RouteWithTrainStopPoints();
        routeWithTrainStopPoints.setRouteId(routeId);
        routeWithTrainStopPoints.setTrainStopPointId(trainStopPointId);
        routeWithTrainStopPointsRepository.save(routeWithTrainStopPoints);
    }

    @Override
    public void deleteTrainStopPoint(Long routeId, Long trainStopPointId) {
        routeWithTrainStopPointsRepository.deleteByRouteIdAndTrainStopPointId(routeId, trainStopPointId);
    }
}
