package dev.razafindratelo.exo9.Ferry;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.ArrayList;
import java.util.List;
@EqualsAndHashCode(callSuper = true)
@Data
public class CarFerry extends Vehicle {
    private List<Vehicle> vehiclesList;

    public CarFerry() {
        super();
        this.vehiclesList = new ArrayList<>();
    }

    public void addVehicle(Vehicle vehicle) {
        this.vehiclesList.add(vehicle);
    }

    public void removeVehicle(Vehicle vehicle) {
        this.vehiclesList.remove(vehicle);
    }

    public boolean containsASpecific(Person person) {
        List<Person> travelers = new ArrayList<>();
        for (Vehicle vehicle : this.vehiclesList) {
            travelers.add(vehicle.getDriver());
            if (vehicle instanceof Car car) {
                List<Person> test = car.getPassengers();
                travelers.addAll(test);
            }
        }
        return travelers.contains(person);
    }

}
