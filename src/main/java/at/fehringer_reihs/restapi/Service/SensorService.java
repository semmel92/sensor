package at.fehringer_reihs.restapi.Service;

import at.fehringer_reihs.restapi.Repository.model.Sensor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface SensorService {
    List<Sensor> getSensors();
    Optional<Sensor> getSensor(long id);
    Sensor createSensor(Sensor sensorRest);
    void deleteSensor(Long id);
}
