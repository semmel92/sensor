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
        //TODO delete this once frontend implemented, only for testing
        timestamp = LocalDateTime.now();
    }

    public MeasurementDto(long sensorId, LocalDateTime timestamp, double temperature, double humidity) {
        this.sensorId = sensorId;
        this.timestamp = timestamp;
        this.temperature = temperature;
        this.humidity = humidity;
    }
}
