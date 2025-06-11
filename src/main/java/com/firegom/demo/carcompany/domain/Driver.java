package com.firegom.demo.carcompany.domain;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.util.List;

import static com.firegom.demo.carcompany.domain.DrivingLicenceCategory.*;


public class Driver {
    @Getter
    private final LocalDate birthDate ;
    @Getter
    private final LocalDate drivingLiceseDate ;
    @Getter
    @Setter
    private List<DrivingLicenceCategory> drivingLicenceCategory;


    public Driver(LocalDate birthDate, LocalDate drivingLiceseDate, List<DrivingLicenceCategory> drivingLicenceCategory) {
        this.birthDate = birthDate;
        this.drivingLiceseDate = drivingLiceseDate;
        this.drivingLicenceCategory = drivingLicenceCategory;

        if (birthDate == null || drivingLiceseDate == null) {
            throw new IllegalArgumentException("Nieprawidłowe parametry.");
        }
        if (birthDate.isAfter(LocalDate.now().minusYears(16))){
            throw new IllegalArgumentException("Nie możesz prowadzić żadnego pojazdu.");
        }
    }

    public boolean canDrive(DrivingLicenceCategory category) {
        return (drivingLicenceCategory.contains(category));
    }

    public boolean canDriveMotorcycle() {
        return canDrive(A);
    }

    public boolean canDriveTractor() {
        if (drivingLicenceCategory.contains(T) && !birthDate.isAfter(LocalDate.now().minusYears(18))) return true;
        return drivingLicenceCategory.contains(B) && !birthDate.isAfter(LocalDate.now().minusYears(24));
    }

    public boolean canDriveBus() {
        return drivingLicenceCategory.contains(D) && !birthDate.isAfter(LocalDate.now().minusYears(26));
    }

    public boolean canDriveCar() {
        return canDrive(B);
    }

    public boolean canDriveTruck() {
        return canDrive(C);
    }
}