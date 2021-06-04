package app.repository;

import app.domain.StopPoint;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TrainStopPointRepository extends JpaRepository<StopPoint, Long> {
}
