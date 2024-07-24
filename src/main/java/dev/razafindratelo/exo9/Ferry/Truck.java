package dev.razafindratelo.exo9.Ferry;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@EqualsAndHashCode(callSuper = true)
@Data

public class Truck extends Vehicle {
    private List<Colis> colisList;

    public Truck (String model, String matriculationId, double gasVolume, double initialWeight, double length) {
        super(model, matriculationId, initialWeight, length, gasVolume);
        this.colisList = new ArrayList<>();
    }

    public void addColis (Colis colis) {
        this.colisList.add(colis);
    }

    public void retrievColis(Colis colis) {
        this.colisList = this.colisList.stream().filter(col -> col.id() != colis.id()).collect(Collectors.toList());
    }
    @Override
    public double getWeight(){
        double colisWeight = this.colisList.stream().map(Colis::weight).reduce(0d, Double::sum);
        return super.getWeight() + colisWeight;
    }
}
