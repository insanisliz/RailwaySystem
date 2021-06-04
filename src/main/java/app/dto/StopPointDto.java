package app.dto;

import app.domain.Station;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class StopPointDto {

    private Long id;
    private Station trainStopStation;
    private int arrivalTimeInMinutes;
    private int dispatchTimeInMinutes;
    private int stopDurationInMinutes;
}
