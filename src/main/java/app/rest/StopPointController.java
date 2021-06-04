package app.rest;

import app.dto.StopPointDto;
import app.service.TrainStopPointService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/points")
public class StopPointController {

    private TrainStopPointService trainStopPointService;

    public StopPointController(TrainStopPointService trainStopPointService) {
        this.trainStopPointService = trainStopPointService;
    }

    @PostMapping
    public void add(@RequestBody StopPointDto stopPointDto) {
        trainStopPointService.add(stopPointDto);
    }

    @GetMapping("/{id}")
    public StopPointDto getTrainStopPointById(@PathVariable("id") Long id) {
        return trainStopPointService.findById(id);
    }

    @GetMapping
    public List<StopPointDto> getTrainStopPoints() {
        return trainStopPointService.findAll();
    }

    @PutMapping
    public void update(@RequestBody StopPointDto stopPointDto) {
        trainStopPointService.update(stopPointDto);
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable("id") Long id) {
        trainStopPointService.deleteById(id);
    }
}
