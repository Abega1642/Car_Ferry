package dev.razafindratelo.exo8;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.util.Date;

@Getter
@Setter
public class RoomBooking extends Booking{

    private int roomId;
    private int numberOfNight;
    private RoomType roomType;

    public RoomBooking(int bookingId, String clientName, LocalDate bookingDate, int roomId, int numberOfNight, RoomType roomType) {
        super(bookingId, clientName, bookingDate);
        this.roomId = roomId;
        this.numberOfNight = numberOfNight;
        this.roomType = roomType;
    }

    @Override
    public double calculateTotalCost() {
        return this.roomType.getValue() * this.numberOfNight;
    }

}
