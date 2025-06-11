package com.firegom.demo.carcompany.domain;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class CompanyTest {
    Company unit;
    @BeforeEach
    public void before(){
        unit = new Company();
    }

    @Test
    public void testCompanyAllElectric(){
        Emploee e = new Emploee();
        Car c = new Car(EngineType.ELECTRIC);

        assertThat(unit.isAllElectric()).isFalse();
        unit.addEmploee(e);
        //TODO make sure this is valid scenario if not we need to set all electric to false and change it on first add
        assertThat(unit.isAllElectric()).isTrue();
        unit.addCar(c);
        assertThat(unit.isAllElectric()).isTrue();
        Car c1 = new Car(EngineType.DIESEL);
        unit.addCar(c1);
        assertThat(unit.isAllElectric()).isFalse();
    }


}