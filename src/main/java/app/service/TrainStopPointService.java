package app.service;


import app.dto.StopPointDto;

import java.util.List;

public interface TrainStopPointService {

    void add(StopPointDto stopPointDto);

    StopPointDto findById(Long id);

    List<StopPointDto> findAll();

    void update(StopPointDto stopPointDto);

    void deleteById(Long id);
}
