package app.mapper.impl;

import app.mapper.StationMapper;
import app.domain.Station;
import app.dto.StationDto;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class StationMapperImpl implements StationMapper {
    @Override
    public Station fromDto(StationDto stationDto) {
        return Station.builder()
                .id(stationDto.getId())
                .name(stationDto.getName())
                .build();
    }

    @Override
    public StationDto toDto(Station station) {
        return StationDto.builder()
                .id(station.getId())
                .name(station.getName())
                .build();
    }

    @Override
    public List<Station> fromDtoList(List<StationDto> stationDtoList) {
        List<Station> stationList = new ArrayList<>();
        for (StationDto stationDto:
                stationDtoList) {
            stationList.add(fromDto(stationDto));
        }
        return stationList;
    }

    @Override
    public List<StationDto> toDtoList(List<Station> stationList) {
        List<StationDto> stationDtoList = new ArrayList<>();
        for (Station station:
                stationList) {
            stationDtoList.add(toDto(station));
        }
        return stationDtoList;
    }
}
