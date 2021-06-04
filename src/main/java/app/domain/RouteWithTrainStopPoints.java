package app.domain;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "routes_with_stop_points")
public class RouteWithTrainStopPoints {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "route_id")
    private Long routeId;

    @Column(name = "stop_point_id")
    private Long trainStopPointId;
}
