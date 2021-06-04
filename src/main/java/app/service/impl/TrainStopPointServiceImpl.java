package app.service.impl;

import app.domain.StopPoint;
import app.mapper.TrainStopPointMapper;
import app.dto.StopPointDto;
import app.repository.TrainStopPointRepository;
import app.service.TrainStopPointService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

@Service
public class TrainStopPointServiceImpl implements TrainStopPointService {

    private TrainStopPointRepository trainStopPointRepository;
    private TrainStopPointMapper trainStopPointMapper;

    public TrainStopPointServiceImpl(TrainStopPointRepository trainStopPointRepository, TrainStopPointMapper trainStopPointMapper) {
        this.trainStopPointRepository = trainStopPointRepository;
        this.trainStopPointMapper = trainStopPointMapper;
    }

    public void add(StopPointDto stopPointDto) {
        trainStopPointRepository.save(trainStopPointMapper.fromDto(stopPointDto));
    }

    public StopPointDto findById(Long id) {
        Optional<StopPoint> trainStopPoint = trainStopPointRepository.findById(id);
        if (trainStopPoint.isPresent()) {
            return trainStopPointMapper.toDto(trainStopPoint.get());
        } else {
            throw new NoSuchElementException("No train stop point with id = " + id);
        }
    }

    public List<StopPointDto> findAll() {
        return trainStopPointMapper.toDtoList(trainStopPointRepository.findAll());
    }

    public void update(StopPointDto stopPointDto) {
        trainStopPointRepository.save(trainStopPointMapper.fromDto(stopPointDto));
    }

    public void deleteById(Long id) {
        trainStopPointRepository.deleteById(id);
    }
}
