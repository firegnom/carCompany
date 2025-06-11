package com.firegom.demo.carcompany.domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.List;

import static com.firegom.demo.carcompany.domain.DrivingLicenceCategory.*;
import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

class DriverTest {
    Driver unit;


    @Test
    @DisplayName("Test Driver Constructor invalid null")
    void notNull() {
        assertThatThrownBy(() -> new Driver(null, null, List.of(A, B)))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessageContaining("Nieprawidłowe parametry");

    }

    @Test
    @DisplayName("Test Driver Constructor invalid invalid date")
    void notValidDate() {
        assertThatThrownBy(() -> new Driver(LocalDate.now().minusYears(15), LocalDate.now(), List.of(A, B)))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessageContaining("Nie możesz prowadzić żadnego pojazdu.");

    }

    @Test
    @DisplayName("Test Driver can drive car")
    void canDriveCar() {
        unit = new Driver(LocalDate.now().minusYears(16), LocalDate.now(), List.of(B));
        assertThat(unit.canDriveCar()).isTrue();

    }
    @Test
    @DisplayName("Test Driver can't drive car")
    void cantDriveCar() {
        unit = new Driver(LocalDate.now().minusYears(16), LocalDate.now(), List.of(A));
        assertThat(unit.canDriveCar()).isFalse();

    }

    @Test
    @DisplayName("Test Driver can drive")
    void cantDriveTractor() {
        unit = new Driver(LocalDate.now().minusYears(16), LocalDate.now(), List.of(T));
        assertThat(unit.canDriveTractor()).isFalse();
        unit = new Driver(LocalDate.now().minusYears(18), LocalDate.now(), List.of(T));
        assertThat(unit.canDriveTractor()).isTrue();
        unit = new Driver(LocalDate.now().minusYears(24), LocalDate.now(), List.of(B));
        assertThat(unit.canDriveTractor()).isTrue();
        unit = new Driver(LocalDate.now().minusYears(18), LocalDate.now(), List.of(B));
        assertThat(unit.canDriveTractor()).isFalse();

    }

    @Test
    @DisplayName("Test Driver can Bus")
    void canDriveBus() {
        unit = new Driver(LocalDate.now().minusYears(24), LocalDate.now(), List.of(D));
        assertThat(unit.canDriveTractor()).isFalse();
        unit = new Driver(LocalDate.now().minusYears(26), LocalDate.now(), List.of(B));
        assertThat(unit.canDriveTractor()).isTrue();


    }
}