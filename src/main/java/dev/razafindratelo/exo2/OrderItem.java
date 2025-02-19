package mg.training.exo2;

public class OrderItem {
    private int id;
    private String description;
    private int quantity;
    private double unitPrice;

    public OrderItem(){};

    public OrderItem(int id, String description, int quantity, double unitPrice) {
        this.id = id;
        this.description = description;
        this.quantity = quantity;
        this.unitPrice = unitPrice;
    }

    public int getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public double getTotal() {
        return this.unitPrice * this.quantity;
    }

    @Override
    public String toString() {
        return "OrderItem {" +
                "id = " + id +
                ", description = '" + description + '\'' +
                ", quantity = " + quantity +
                ", unitPrice = " + unitPrice +
                '}';
    }
}
