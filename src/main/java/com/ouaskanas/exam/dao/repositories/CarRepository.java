package com.ouaskanas.exam.dao.repositories;

import com.ouaskanas.exam.dao.entities.Car;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CarRepository extends JpaRepository<Car, Integer> {
    public List<Car> findByModel(String model);
}
