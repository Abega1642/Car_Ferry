package mg.training.exo7;

import java.util.Objects;

public class Electronics extends Products{
    private String brand;
    private double weightInKg;

    public Electronics(int id, String name, String description, double unitPrice, String brand, double weightInKg) {
        super(id, name, description, unitPrice);
        this.brand = brand;
        this.weightInKg = weightInKg;
    }

    public String getBrand() {
        return brand;
    }

    public double getWeightInKg() {
        return weightInKg;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setWeightInKg(int weightInKg) {
        this.weightInKg = weightInKg;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Electronics that = (Electronics) o;
        return getId() == that.getId() && getUnitPrice() == that.getUnitPrice() && weightInKg == that.getWeightInKg() && Objects.equals(getName(), that.getName()) && Objects.equals(getDescription(), that.getDescription()) && Objects.equals(brand, that.getBrand());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getName(), getDescription(), getUnitPrice(), brand, weightInKg);
    }

    @Override
    public String toString() {
        return "Electronics {" +
                "id = " + getId() +
                ", name = '" + getName() + '\'' +
                ", description = '" + getDescription() + '\'' +
                ", unitPrice = " + getUnitPrice() +
                ", brand = '" + brand + '\'' +
                ", weightInKg = " + weightInKg +
                '}';
    }
    @Override
    public double getTTCPrice() {
        return (this.getUnitPrice() + this.weightInKg * 15000);
    }
}
