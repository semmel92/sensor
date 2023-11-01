package at.fehringer_reihs.restapi.Service;

import at.fehringer_reihs.restapi.Rest.model.MeasurementDto;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface MeasurementService {
    List<MeasurementDto> getMeasurementsFromSensor();
    MeasurementDto getSensor(long id);
    MeasurementDto createSensor(MeasurementDto sensor);
}
