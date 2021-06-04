package app.service;

public interface RouteWithTrainStopPointsService {

    void addTrainStopPoint(Long routeId, Long trainStopPointId);

    void deleteTrainStopPoint(Long routeId, Long trainStopPointId);
}
