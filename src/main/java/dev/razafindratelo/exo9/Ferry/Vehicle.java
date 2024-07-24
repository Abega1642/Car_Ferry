package dev.razafindratelo.exo9.Ferry;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import java.time.LocalDate;
import java.time.Period;
import java.util.Date;

@Data

public class Vehicle {
    private String model;
    private String matriculationId;
    private double travelledDistance;
    private double initialWeight;
    private double length;
    private double gasVolume;
    private Driver driver;

    public Vehicle() {
        this.model = "Vehicle";
        this.matriculationId = "000";
        this.travelledDistance = 0;
        this.initialWeight = 0;
        this.length = 0;
        this.gasVolume = 0;
        this.driver = null;
    }

    public Vehicle(String model, String matriculationId, double initialWeight, double length) {
        this.model = model;
        this.matriculationId = matriculationId;
        this.initialWeight = initialWeight;
        this.length = length;
        this.gasVolume = 0;
        this.travelledDistance = 0;
        this.driver = null;
    }

    public Vehicle(String model, String matriculationId, double gasVolume, double initialWeight, double length) {
        this.model = model;
        this.matriculationId = matriculationId;
        this.initialWeight = initialWeight;
        this.length = length;
        this.gasVolume = gasVolume;
        this.travelledDistance = 0;
        this.driver = null;
    }

    public Vehicle(String model, String matriculationId, double travelledDistance, double initialWeight, double length, double gasVolume, Driver driver) {
        this.model = model;
        this.matriculationId = matriculationId;
        this.travelledDistance = travelledDistance;
        this.initialWeight = initialWeight;
        this.length = length;
        this.gasVolume = gasVolume;
        Period diff = Period.between(driver.getBirthDate(), LocalDate.now());
        int year = diff.getYears();
        if (year < 18) {
            throw new RuntimeException("A driver should be greater than 18");
        }
        this.driver = driver;
    }

    public void goToGasStation(double gasLiter) {
        this.gasVolume += gasLiter;
    }

    public double getWeight(){
        return this.initialWeight + this.gasVolume;
    }

    public void rooling(double distance, double gasConsumRatio){
        if (this.gasVolume - distance * gasConsumRatio < 0
            || driver == null || this.driver.equals(new Driver())){
            throw new RuntimeException("This operation is not permit");
        } else {
            this.travelledDistance += distance;
        }
    }

    public void changeDriver(Driver driver){
        Period diff = Period.between(driver.getBirthDate(), LocalDate.now());
        int year = diff.getYears();
        if (year < 18) {
            throw new RuntimeException("A driver should be greater than 18");
        }
        this.driver = driver;
    }
}
