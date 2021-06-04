package app.mapper.impl;

import app.mapper.TrainStopPointMapper;
import app.domain.StopPoint;
import app.dto.StopPointDto;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class StopPointMapperImpl implements TrainStopPointMapper {
    @Override
    public StopPoint fromDto(StopPointDto stopPointDto) {
        return StopPoint.builder()
                .id(stopPointDto.getId())
                .trainStopStation(stopPointDto.getTrainStopStation())
                .arrivalTimeInMinutes(stopPointDto.getArrivalTimeInMinutes())
                .dispatchTimeInMinutes(stopPointDto.getDispatchTimeInMinutes())
                .stopDurationInMinutes(stopPointDto.getStopDurationInMinutes())
                .build();
    }

    @Override
    public StopPointDto toDto(StopPoint trainStopPoint) {
        return StopPointDto.builder()
                .id(trainStopPoint.getId())
                .trainStopStation(trainStopPoint.getTrainStopStation())
                .arrivalTimeInMinutes(trainStopPoint.getArrivalTimeInMinutes())
                .dispatchTimeInMinutes(trainStopPoint.getDispatchTimeInMinutes())
                .stopDurationInMinutes(trainStopPoint.getStopDurationInMinutes())
                .build();
    }

    @Override
    public List<StopPoint> fromDtoList(List<StopPointDto> stopPointDtoList) {
        List<StopPoint> stopPointList = new ArrayList<>();
        for (StopPointDto stopPointDto :
                stopPointDtoList) {
            stopPointList.add(fromDto(stopPointDto));
        }
        return stopPointList;
    }

    @Override
    public List<StopPointDto> toDtoList(List<StopPoint> stopPointList) {
        List<StopPointDto> stopPointDtoList = new ArrayList<>();
        for (StopPoint stopPoint :
                stopPointList) {
            stopPointDtoList.add(toDto(stopPoint));
        }
        return stopPointDtoList;
    }
}
