package at.fehringer_reihs.restapi.Repository.model;

import at.fehringer_reihs.restapi.Rest.model.SensorType;
import jakarta.persistence.*;

@Entity
public class Sensor {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private long id;
    private String name;
    private String location;
    private boolean active;
    @Enumerated(EnumType.STRING)
    private SensorType type;

    public Sensor() {
        this.id = 1;
        this.name = "TestSensor";
        this.location = "TestLocation";
        this.active = false;
        this.type = SensorType.INDOOR;
    }
}