package com.firegom.demo.carcompany.domain;

import lombok.Getter;

import java.time.LocalDate;
import java.util.*;

public class Company {
    private boolean allElectric = true;
    @Getter
    private Set<Car> avaliableCars;
    @Getter
    private Set<Emploee> emploees;
    @Getter
    private Map<Car, Emploee> carAssignment;

    public Company(){
        avaliableCars = new HashSet<>();
        emploees = new HashSet<>();
        carAssignment =  new HashMap<>();
    }

    public boolean addCar(Car car) {
        if (car.getProductionDate().isAfter(LocalDate.now()))
            throw new IllegalArgumentException("Can'rt add old car");


        if (allElectric && !car.getEngine().equals(EngineType.ELECTRIC)) {
            allElectric = false;
        }


        return avaliableCars.add(car);
    }

    public void addEmploee( Emploee emploee){
        emploees.add(emploee);
    }

    public void assignCar(Emploee emploee, Car car){
        if (!emploees.contains(emploee))
            throw new IllegalArgumentException("Cant find Emploee");
        if (!avaliableCars.contains(car))
            throw new IllegalArgumentException("Cant find Car");
        avaliableCars.remove(car);
        carAssignment.put(car,emploee);
    }

    public boolean isAllElectric() {
        return allElectric && emploees.size() > 0;
    }
}
