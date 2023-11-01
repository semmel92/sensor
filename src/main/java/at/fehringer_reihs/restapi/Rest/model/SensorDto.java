package at.fehringer_reihs.restapi.Rest.model;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class SensorDto {

    private long id;
    private String name;
    private String location;
    private boolean active;
    private SensorType type;

    public SensorDto() {
        this.id = 1;
        this.name = "TestSensor";
        this.location = "TestLocation";
        this.active = false;
        this.type = SensorType.INDOOR;
    }
}
