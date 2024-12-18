package com.ouaskanas.exam.services;

import com.ouaskanas.exam.dto.CarDto;

import java.util.List;

public interface CarService {

    public List<CarDto> getCarsbyModel(String model);
    public CarDto saveCar(CarDto carDto);
}
