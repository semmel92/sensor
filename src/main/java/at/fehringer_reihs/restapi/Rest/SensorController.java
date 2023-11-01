package at.fehringer_reihs.restapi.Rest;

import at.fehringer_reihs.restapi.Repository.model.Sensor;
import at.fehringer_reihs.restapi.Rest.model.SensorDto;
import at.fehringer_reihs.restapi.Service.SensorService;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.lang.reflect.Type;
import java.util.List;

@RestController
@RequestMapping("/sensors")
public class SensorController {

    private SensorService sensorService;
    private ModelMapper modelMapper = new ModelMapper();

    @Autowired
    public SensorController(SensorService sensorService) {
        this.sensorService = sensorService;
    }

    @GetMapping("/{id}")
    public SensorDto getSensor(@PathVariable Long id){
        return modelMapper.map(sensorService.getSensor(id), SensorDto.class);
    }
    @GetMapping
    public List<SensorDto> getSensors(){
        Type listType = new TypeToken<List<SensorDto>>(){}.getType();
        return modelMapper.map(sensorService.getSensors(), listType);
    }
    @PostMapping
    public SensorDto createSensor(@RequestBody SensorDto sensorDto){
        Sensor createdSensor = sensorService.createSensor(modelMapper.map(sensorDto, Sensor.class));
        return modelMapper.map(createdSensor, SensorDto.class);
    }

    @DeleteMapping("/{id}")
    public void deleteSensor(@PathVariable Long id){
        sensorService.deleteSensor(id);
    }
}
