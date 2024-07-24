package dev.razafindratelo.exo8;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

@Setter
@Getter
@AllArgsConstructor
public abstract class Booking {
    private int bookingId;
    private String clientName;
    private LocalDate bookingDate;
    public abstract double calculateTotalCost();
}
