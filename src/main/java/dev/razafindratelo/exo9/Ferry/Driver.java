package dev.razafindratelo.exo9.Ferry;

import lombok.*;

import java.time.LocalDate;

@Getter
@Setter

public class Driver extends Traveler {
    private String driverLicenceId;

    public Driver(String driverLicenceId, String firstName, String lastname, LocalDate birthday, String addr, double weight, LocalDate travelDate) {
        super(firstName, lastname, birthday, addr, weight, travelDate);
        this.driverLicenceId = driverLicenceId;
    }
}
