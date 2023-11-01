package at.fehringer_reihs.restapi.Repository;

import at.fehringer_reihs.restapi.Repository.model.Sensor;
import org.springframework.data.repository.CrudRepository;

public interface SensorRepository extends CrudRepository<Sensor, Long> {

}
