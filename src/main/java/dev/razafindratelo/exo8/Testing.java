package dev.razafindratelo.exo8;

import java.time.Duration;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import static java.time.temporal.ChronoUnit.DAYS;

public class Testing {
    public static void main(String[] args) {
        RoomBooking room = new RoomBooking(1, "Razafindratelo", LocalDate.of(2024, 2, 13), 1, 5, RoomType.VIP);
        ActivityBooking activity = new ActivityBooking(1, "Razafindratelo", LocalDate.of(2024, 2, 13), 3, Duration.of(5, DAYS));
        List<Booking> bookings = new ArrayList<>();
        bookings.add(room);
        bookings.add(activity);
        double sum = bookings.stream().map(Booking::calculateTotalCost).reduce(0d, Double::sum);
        System.out.println("--- Getting the som of all bookings --- : Total sum = " + sum);
    }
}
