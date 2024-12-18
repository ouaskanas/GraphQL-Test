package com.ouaskanas.exam.mapper;

import com.ouaskanas.exam.dao.entities.Car;
import com.ouaskanas.exam.dto.CarDto;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
public class CarMapper {

    private final ModelMapper modelMapper = new ModelMapper();

    public Car DtoToModel(CarDto carDto) {
        return modelMapper.map(carDto, Car.class);
    }

    public CarDto ModelToDto(Car car) {
        return modelMapper.map(car, CarDto.class);
    }

}
