package app.mapper;


import app.domain.Station;
import app.dto.StationDto;

import java.util.List;

public interface StationMapper {

    Station fromDto(StationDto stationDto);

    StationDto toDto(Station station);

    List<Station> fromDtoList(List<StationDto> stationDtoList);

    List<StationDto> toDtoList(List<Station> stationList);
}
