package com.ouaskanas.exam.dto;

import lombok.*;


@Setter
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class CarDto {
    String model;
    String color;
    String matricule;
    Float price;
}
