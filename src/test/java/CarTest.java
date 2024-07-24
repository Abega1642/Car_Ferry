import dev.razafindratelo.exo9.Ferry.Car;
import dev.razafindratelo.exo9.Ferry.Driver;
import dev.razafindratelo.exo9.Ferry.Traveler;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class CarTest {
    @Test
    void tests_adding_passengers() {
        Traveler traveler1 = new Traveler("traveler",
                "TRAVELER",
                LocalDate.of(1995,2,13),
                "Address",
                50d,
                LocalDate.now());
        Driver me = new Driver("15df",
                "Driver",
                "DRIVER",
                LocalDate.of(2005, 4, 4),
                "Address",
                65d,
                LocalDate.now());
        Car car = new Car();
        car.setDriver(me);

        car.addAPassenger(traveler1);
        car.addAPassenger(traveler1);
        car.addAPassenger(traveler1);
        car.addAPassenger(traveler1);
        car.addAPassenger(traveler1);

        assertThrows(RuntimeException.class, () -> car.addAPassenger(traveler1));

    }
}
