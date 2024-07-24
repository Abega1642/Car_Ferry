package dev.razafindratelo.exo9.Ferry;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class Person {
    private String firstName;
    private String lastName;
    private LocalDate birthDate;
    private String address;
    private double weight;

    public void traveling(){};
}
