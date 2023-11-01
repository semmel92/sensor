package at.fehringer_reihs.restapi.Rest.model;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter @Setter
public class MeasurementDto {

    private long sensorId;
    private LocalDateTime timestamp;
    private double temperature;
    private double humidity;

    public MeasurementDto() {
        this.sensorId = 1;
        this.temperature = 10;
        this.humidity = 0.2;
        this.timestamp = LocalDateTime.now();
    }
}
