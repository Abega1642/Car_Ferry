import dev.razafindratelo.exo9.Ferry.Driver;
import dev.razafindratelo.exo9.Ferry.Truck;
import dev.razafindratelo.exo9.Ferry.Vehicle;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class VehicleTest {
    @Test
    void instantiate_a_valid_truck() {
        Truck truck = new Truck();

        assertNull(truck.getDriver());
    }
}
