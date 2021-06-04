package app.rest;


import app.dto.StationDto;
import app.service.StationService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/stations")
public class StationController {

    private StationService stationService;

    public StationController(StationService stationService) {
        this.stationService = stationService;
    }

    @PostMapping
    public void add(@RequestBody StationDto stationDto) {
        stationService.add(stationDto);
    }

    @GetMapping("/{id}")
    public StationDto getStationById(@PathVariable("id") Long id) {
        return stationService.findById(id);
    }

    @GetMapping
    public List<StationDto> getStations() {
        return stationService.findAll();
    }

    @PutMapping
    public void update(@RequestBody StationDto stationDto) {
        stationService.update(stationDto);
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable("id") Long id) {
        stationService.deleteById(id);
    }
}
