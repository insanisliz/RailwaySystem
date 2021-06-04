package app.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "stop_points")
public class StopPoint {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @OneToOne
    @JoinColumn(name = "station_id", referencedColumnName = "id")
    private Station trainStopStation;

    @Column(name = "arrival_time_in_minutes")
    private int arrivalTimeInMinutes;

    @Column(name = "dispatch_time_in_minutes")
    private int dispatchTimeInMinutes;

    @Column(name = "stop_duration_in_minutes")
    private int stopDurationInMinutes;
}
