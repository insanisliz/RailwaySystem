package app.domain;

import lombok.Data;

@Data
public class EmergencySituation {

    private EmergencySituationType type;
    private int timeOfTheIncident;
    private int durationInMinutes;
    private String additionalInformation;
}
