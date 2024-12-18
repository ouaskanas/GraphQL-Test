package com.ouaskanas.exam.services;

import com.ouaskanas.exam.dao.entities.Car;
import com.ouaskanas.exam.dao.repositories.CarRepository;
import com.ouaskanas.exam.dto.CarDto;
import com.ouaskanas.exam.mapper.CarMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class CarServiceImpl implements CarService{

    @Autowired
    private CarRepository carRepository;

    @Autowired
    private CarMapper carMapper;

    @Override
    public List<CarDto> getCarsbyModel(String model) {
            List<Car> cars =  carRepository.findByModel(model);
            List<CarDto> carDtos = new ArrayList<>();
            return carRepository.findByModel(model)
                .stream()
                .map(carMapper::ModelToDto)
                .collect(Collectors.toList());
    }

    @Override
    public CarDto saveCar(CarDto carDto) {
        carRepository.save(carMapper.DtoToModel(carDto));
        return carDto;
    }
}
