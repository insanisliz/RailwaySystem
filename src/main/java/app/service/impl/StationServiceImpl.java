package app.service.impl;

import app.domain.Station;
import app.mapper.StationMapper;
import app.dto.StationDto;
import app.repository.StationRepository;
import app.service.StationService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

@Service
public class StationServiceImpl implements StationService {

    private StationRepository stationRepository;
    private StationMapper stationMapper;

    public StationServiceImpl(StationRepository stationRepository, StationMapper stationMapper) {
        this.stationRepository = stationRepository;
        this.stationMapper = stationMapper;
    }

    public void add(StationDto stationDto) {
        stationRepository.save(stationMapper.fromDto(stationDto));
    }

    public StationDto findById(Long id) {
        Optional<Station> station = stationRepository.findById(id);
        if (station.isPresent()) {
            return stationMapper.toDto(station.get());
        } else {
            throw new NoSuchElementException("No station with id = " + id);
        }
    }

    public List<StationDto> findAll() {
        return stationMapper.toDtoList(stationRepository.findAll());
    }

    public void update(StationDto stationDto) {
        stationRepository.save(stationMapper.fromDto(stationDto));
    }

    public void deleteById(Long id) {
        stationRepository.deleteById(id);
    }
}
