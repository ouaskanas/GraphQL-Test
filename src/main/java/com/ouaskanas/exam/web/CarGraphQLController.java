package com.ouaskanas.exam.web;

import com.ouaskanas.exam.dao.entities.Car;
import com.ouaskanas.exam.dto.CarDto;
import com.ouaskanas.exam.services.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class CarGraphQLController {

    @Autowired
    private CarService carService;

    @QueryMapping
    public List<CarDto> getCarByModel(@Argument String model) {
        return carService.getCarsbyModel(model);
    }

    @MutationMapping
    public CarDto saveCar(@Argument CarDto car) {
        return carService.saveCar(car);
    }
}
