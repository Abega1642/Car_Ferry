package dev.razafindratelo.exo9.Ferry;

import lombok.Data;
import java.time.LocalDate;
import java.time.Period;


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
        this.matriculationId = "000000";
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

    public Vehicle(String model, String matriculationId, double travelledDistance, double initialWeight, double length, double gasVolume) {
        this.model = model;
        this.matriculationId = matriculationId;
        this.travelledDistance = travelledDistance;
        this.initialWeight = initialWeight;
        this.length = length;
        this.gasVolume = gasVolume;
        this.driver = null;
    }

    public void goToGasStation(double gasLiter) {
        this.gasVolume += gasLiter;
    }

    public double getWeight(){
        return this.initialWeight + this.gasVolume + this.driver.getWeight();
    }

    public void rooling(double distance, double gasConsumRatio){
        if (this.gasVolume < distance * gasConsumRatio
            || this.driver == null){
            throw new RuntimeException("This operation is not permit");
        } else {
            this.travelledDistance += distance;
            this.gasVolume -= distance * gasConsumRatio;
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
