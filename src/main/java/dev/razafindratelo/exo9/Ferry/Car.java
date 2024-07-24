package dev.razafindratelo.exo9.Ferry;

import lombok.*;

import java.util.ArrayList;
import java.util.List;

@EqualsAndHashCode(callSuper = true)
@Data
public class Car extends Vehicle {
    private int maxPassengers;
    private List<Person> passengers;

    public Car() {
        super();
        this.maxPassengers = 5;
        this.passengers = new ArrayList<>();
    }

    public Car(int maxPassengers, List<Person> passengers) {
        super();
        this.maxPassengers = maxPassengers;
        if (passengers.size() > this.maxPassengers) {
            throw new RuntimeException("Number of passengers exceeds maximum number of passengers");
        } else {
            this.passengers = passengers;
        }
    }

    public void addAPassenger(Person person) {
        List<Person> passengerList = this.passengers;
        passengerList.add(person);
        if (passengerList.size() > this.maxPassengers) {
            throw new RuntimeException("Number of passengers exceeds the maximum number of passengers");
        } else {
            this.passengers = passengerList;
        }
    }
    public void removeAPassenger(Person person) {
        if (this.passengers.size()  - 1 < 0) {
            throw new RuntimeException("There are no more passengers");
        } else {
            this.passengers.remove(person);
        }
    }

}
