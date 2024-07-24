package dev.razafindratelo.exo9.Ferry;

import lombok.*;

import java.util.ArrayList;
import java.util.List;

@EqualsAndHashCode(callSuper = true)
@Data
public class Car extends Vehicle {
    private int maxPassengers;
    private List<Traveler> passengers;

    public Car() {
        super();
        this.maxPassengers = 5;
        this.passengers = new ArrayList<>();
    }

    public Car(int maxPassengers) {
        super();
        this.maxPassengers = maxPassengers;
    }

    public void addAPassenger(Traveler person) {
        if (passengers.size() + 1 > this.maxPassengers) {
            throw new RuntimeException("Number of passengers exceeds the maximum number of passengers");
        } else {
            this.passengers.add(person);
        }
    }

    public void removeAPassenger(Traveler person) {
        if (this.passengers.isEmpty()) {
            throw new RuntimeException("There are no more passengers");
        } else {
            this.passengers.remove(person);
        }
    }
    @Override
    public double getWeight(){
        double passengerWeight = this.passengers.stream().map(Traveler::getWeight).reduce(0d, Double::sum);
        return super.getWeight() + passengerWeight;
    }

}
