package at.fehringer_reihs.restapi.Rest;

import at.fehringer_reihs.restapi.Rest.model.MeasurementDto;
import at.fehringer_reihs.restapi.Service.MeasurementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/measurements")
public class MeasurementController {
    private MeasurementService measurementService;

    @Autowired
    public MeasurementController(MeasurementService measurementService){
        this.measurementService = measurementService;
    }

    @GetMapping("/{id}")
    public MeasurementDto getMeasurementsFromSensor(@PathVariable Long id){
        return null;
    }
}
