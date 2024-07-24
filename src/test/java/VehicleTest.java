import dev.razafindratelo.exo9.Ferry.*;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class VehicleTest {
    @Test
    void no_driver_inside_a_new_vehicle() {
        Truck truck = new Truck("Mercedes", "0000", 0, 1000d, 50);
        Car car = new Car();
        Vehicle vehicle = new Vehicle();
        assertNull(truck.getDriver());
        assertNull(vehicle.getDriver());
        assertNull(car.getDriver());
    }
    @Test
    void check_traveled_distance_By_Vehicle() {
        Driver me = new Driver("15df",
                "Driver",
                "DRIVER",
                LocalDate.of(2005, 4, 4),
                "Address",
                65d,
                LocalDate.now());
        Truck truck = new Truck("Mercedes",
                "000102TBF",
                0d,
                1000,
                10d);

        truck.rooling(60d, 0.3d);

        assertEquals(60d, truck.getTravelledDistance());
        assertThrows(RuntimeException.class, () -> truck.rooling(9000d, 10d));
    }
    @Test
    void test_if_a_driver_is_inside_a_carFerry() {
        Driver me = new Driver("15df",
                "Driver",
                "DRIVER",
                LocalDate.of(2005, 4, 4),
                "Address",
                65d,
                LocalDate.now());
        Truck truck = new Truck("Mercedes",
                "000102TBF",
                0d,
                1000,
                10d);
        CarFerry carFerry = new CarFerry();
        carFerry.setDriver(me);
        carFerry.addVehicle(truck);

        assertTrue(carFerry.containsASpecific(me));
    }
    @Test
    void tests_if_a_very_young_driver_can_Drive() {
        Driver me = new Driver("15df",
                "Driver",
                "DRIVER",
                LocalDate.of(2015, 4, 4),
                "Address",
                65d,
                LocalDate.now());
        Car car = new Car();

        assertThrows(RuntimeException.class, () -> car.changeDriver(me));
    }
}
