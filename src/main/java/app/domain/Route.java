package app.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "routes")
public class Route {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "length_in_km")
    private double lengthInKm;

    @Column(name = "start_time")
    private int startTime;

    @ManyToOne
    @JoinColumn(name = "departure_point_id", referencedColumnName = "id")
    private Station departurePoint;

    @ManyToMany
    @JoinTable(name = "routes_with_intermediate_stations",
            joinColumns = @JoinColumn(name = "route_id"),
            inverseJoinColumns = @JoinColumn(name = "station_id"))
    private List<Station> intermediateStations;

    @ManyToOne
    @JoinColumn(name = "destination_point_id", referencedColumnName = "id")
    private Station destinationPoint;

    @ManyToMany
    @JoinTable(name = "routes_with_stop_points",
            joinColumns = @JoinColumn(name = "route_id"),
            inverseJoinColumns = @JoinColumn(name = "stop_point_id"))
    private List<StopPoint> stopPoints;
}
