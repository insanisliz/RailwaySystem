package app.repository;

import app.domain.RouteWithTrainStopPoints;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RouteWithTrainStopPointsRepository extends JpaRepository<RouteWithTrainStopPoints, Long> {

    void deleteByRouteIdAndTrainStopPointId(Long routeId, Long trainStopPointId);
}
