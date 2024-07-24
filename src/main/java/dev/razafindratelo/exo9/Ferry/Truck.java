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

    public Truck() {
        super();
        this.colisList = new ArrayList<>();
    }

    public Truck (String model, String matriculationId, double travelledDistance, double initialWeight, double length, double gasVolume, Driver driver) {
        super(model, matriculationId, travelledDistance, initialWeight, length, gasVolume, driver);
        this.colisList = new ArrayList<>();
    }

    public Truck (String model, String matriculationId, double gasVolume, double initialWeight, double length) {
        super(model, matriculationId, initialWeight, length, gasVolume);
        this.colisList = new ArrayList<>();
    }

    public void addColis (Colis colis) {
        this.colisList.add(colis);
    }

    public List<Colis> retrievColis(Colis colis) {
        return this.colisList.stream().filter(col -> col.id() != colis.id()).collect(Collectors.toList());
    }
}
