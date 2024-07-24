package mg.training.exo7;

import java.util.Objects;

public class ElectronicsN {
    private int id;
    private String name;
    private String description;
    private double unitPrice;
    private String brand;
    private int weightInKg;

    public ElectronicsN(int id, String name, String description, double unitPrice, String brand, int weightInKg) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.unitPrice = unitPrice;
        this.brand = brand;
        this.weightInKg = weightInKg;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public String getBrand() {
        return brand;
    }

    public int getWeightInKg() {
        return weightInKg;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
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
        ElectronicsN that = (ElectronicsN) o;
        return id == that.id && unitPrice == that.unitPrice && weightInKg == that.weightInKg && Objects.equals(name, that.name) && Objects.equals(description, that.description) && Objects.equals(brand, that.brand);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, description, unitPrice, brand, weightInKg);
    }

    @Override
    public String toString() {
        return "Electronics {" +
                "id = " + id +
                ", name = '" + name + '\'' +
                ", description = '" + description + '\'' +
                ", unitPrice = " + unitPrice +
                ", brand = '" + brand + '\'' +
                ", weightInKg = " + weightInKg +
                '}';
    }

    public double getTTCPrice() {
        return (this.unitPrice + this.weightInKg * 15000);
    }

}
