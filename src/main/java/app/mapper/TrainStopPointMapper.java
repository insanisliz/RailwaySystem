package app.mapper;

import app.domain.StopPoint;
import app.dto.StopPointDto;

import java.util.List;

public interface TrainStopPointMapper {
    StopPoint fromDto(StopPointDto stopPointDto);

    StopPointDto toDto(StopPoint stopPoint);

    List<StopPoint> fromDtoList(List<StopPointDto> routeDtoList);

    List<StopPointDto> toDtoList(List<StopPoint> routeList);
}
