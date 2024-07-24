package mg.training.exo2;

import java.util.List;

public class OrderItemTest {
    public static void main(String[] args) {
        OrderItem order1 = new OrderItem(1, "Jus", 5, 5000d);
        OrderItem order2 = new OrderItem(2, "Chocolats", 2, 1000d);


        System.out.println(order1.getTotal());
        Order order = new Order("Abegà", List.of(order1, order2));
        System.out.println(order.getSum());
        System.out.println(order1.toString());
        System.out.println(order2.toString());
    }
}
