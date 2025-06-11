package com.firegom.demo.carcompany.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.time.LocalDate;

@Data
public class Car {
    private final EngineType engine;
    private final LocalDate productionDate;


    public Car(EngineType engine){
        this.engine = engine;
        productionDate = LocalDate.now();
    }

}
