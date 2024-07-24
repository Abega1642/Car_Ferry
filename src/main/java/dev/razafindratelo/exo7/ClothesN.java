package mg.training.exo7;

import java.util.Objects;

public class ClothesN {
    private int id;
    private String name;
    private String description;
    private double unitPrice;
    private String size;
    private String material;

    public ClothesN(int id, String name, String description, double unitPrice, String size, String material) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.unitPrice = unitPrice;
        this.size = size;
        this.material = material;
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

    public String getMaterial() {
        return material;
    }

    public String getSize() {
        return size;
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

    public void setSize(String size) {
        this.size = size;
    }


    public void setMaterial(String material) {
        this.material = material;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ClothesN clothesN = (ClothesN) o;
        return id == clothesN.id && unitPrice == clothesN.unitPrice && Objects.equals(name, clothesN.name) && Objects.equals(description, clothesN.description) && Objects.equals(size, clothesN.size) && Objects.equals(material, clothesN.material);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, description, unitPrice, size, material);
    }

    @Override
    public String toString() {
        return "Clothes {" +
                "id = " + id +
                ", name = '" + name + '\'' +
                ", description = '" + description + '\'' +
                ", unitPrice = " + unitPrice +
                ", size = '" + size + '\'' +
                ", material = '" + material + '\'' +
                '}';
    }

    public double getTTCPrice() {
        return ((size.equals("L") || size.equals("XL") || size.equals("XXL")) && this.material.equals("cotton")) ?
                ( this.unitPrice * 115 / 100 ) : ( this.unitPrice );
    }
}
