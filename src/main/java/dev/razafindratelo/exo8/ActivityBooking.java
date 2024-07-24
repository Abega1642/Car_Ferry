package dev.razafindratelo.exo8;

import java.time.Duration;
import java.time.LocalDate;
import java.util.Date;

public class ActivityBooking  extends Booking{
    public String activityName;
    public int numberOfParticipants;
    public Duration duration;

    public ActivityBooking(int bookingId, String clientName, LocalDate bookingDate, int numberOfParticipants, Duration duration) {
        super(bookingId, clientName, bookingDate);
        this.numberOfParticipants = numberOfParticipants;
        this.duration = duration;
    }

    @Override
    public double calculateTotalCost() {
        return 5 * numberOfParticipants * this.duration.toMinutes();
    }
}
