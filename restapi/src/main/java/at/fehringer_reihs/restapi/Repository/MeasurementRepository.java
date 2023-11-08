package at.fehringer_reihs.restapi.Repository;

import at.fehringer_reihs.restapi.Repository.model.Measurement;
import org.springframework.data.repository.CrudRepository;

public interface MeasurementRepository extends CrudRepository<Measurement, Long> {
}
