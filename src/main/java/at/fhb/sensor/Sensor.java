package com.example.accessingdatarest;

/**
*
*    Scheiß Javadoc
*
*/
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

import java.time.LocalDateTime;

@Entity
public class Sensor {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private double temperature;
    private double humidity;
    private LocalDateTime timestamp;

    // Getter
    public long getId() {
        return id;
    }
    public double getTemperature(){
        return temperature;
    }
    public double getHumidity() {
        return humidity;
    }
    public LocalDateTime getTimestamp() {
        return timestamp;
    }
    // Setter
    public void setTemperature() {
        this.temperature = temperature;
    }
    public void setHumidity() {
        this.humidity = humidity;
    }
    public void setTimestamp() {
        this.timestamp = timestamp;
    }
}
