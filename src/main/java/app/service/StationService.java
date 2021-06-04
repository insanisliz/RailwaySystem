package app.service;



import app.dto.StationDto;

import java.util.List;

public interface StationService {

    void add(StationDto stationDto);

    StationDto findById(Long id);

    List<StationDto> findAll();

    void update(StationDto stationDto);

    void deleteById(Long id);
}
