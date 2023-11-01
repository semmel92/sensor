package at.fehringer_reihs.restapi.Service;

import at.fehringer_reihs.restapi.Rest.model.MeasurementDto;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class MeasurementServiceImpl implements MeasurementService {

    private static final List<MeasurementDto> measurements = new ArrayList<>();

    @Override
    public List<MeasurementDto> getMeasurementsFromSensor() {
        return measurements;
    }

    @Override
    public MeasurementDto getSensor(long id) {
        return measurements.stream()
                .filter(sensor -> sensor.getSensorId() == id)
                .findFirst()
                .orElse(null);
    }

    @Override
    public MeasurementDto createSensor(MeasurementDto sensor) {
        int freeId = measurements.size();
        sensor.setSensorId(freeId);
        measurements.add(sensor);
        return sensor;
    }
}
