package app.dto;

import app.domain.Station;
import app.domain.StopPoint;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class RouteDto {

    private Long id;
    private String name;
    private double lengthInKm;

    private int startTime;

    private Station departurePoint;
    private List<Station> intermediateStations;
    private Station destinationPoint;

    private List<StopPoint> stopPoints;
}
