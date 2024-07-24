package dev.razafindratelo.exo9.Ferry;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
@EqualsAndHashCode(callSuper = true)
@Data

public class Traveler extends Person {
    private LocalDate travelingDate;

    @Override
    public double getWeight(){
      return this == null ? 0 : this.getWeight();
    }

    public Traveler (String firstName, String lastname, LocalDate birthday, String addr, double weight, LocalDate travelingDate) {
        super(firstName, lastname, birthday, addr, weight);
        this.travelingDate = travelingDate;
    }
}
