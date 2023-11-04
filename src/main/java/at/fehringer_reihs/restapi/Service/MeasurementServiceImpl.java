package at.fehringer_reihs.restapi.Service;

import at.fehringer_reihs.restapi.Repository.MeasurementRepository;
import at.fehringer_reihs.restapi.Repository.model.Measurement;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class MeasurementServiceImpl implements MeasurementService {

    @Autowired
    private MeasurementRepository measurementRepository;

    @Override
    public Optional<Measurement> getMeasurement(Long measurementId) {
        return measurementRepository.findById(measurementId);
    }
}
