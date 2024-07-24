package mg.training.exo7;

import java.util.Objects;

public class Clothes extends Products{
    private String size;
    private String material;

    public Clothes(int id, String name, String description, double unitPrice, String size, String material) {
        super(id, name, description, unitPrice);
        this.size = size;
        this.material = material;
    }

    public String getSize() {
        return size;
    }

    public String getMaterial() {
        return material;
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
        Clothes clothes = (Clothes) o;
        return Objects.equals(size, clothes.size) && Objects.equals(material, clothes.material);
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getName(), getDescription(), getUnitPrice(), size, material);
    }

    @Override
    public String toString() {
        return "Clothes {" +
                "id = " + getId() +
                ", name = '" + getName() + '\'' +
                ", description = '" + getDescription() + '\'' +
                ", unitPrice = " + getUnitPrice() +
                ", size = '" + size + '\'' +
                ", material = '" + material + '\'' +
                '}';
    }
    public double getTTCPrice() {
        return (
                  (
                    size.equalsIgnoreCase("L")
                    || size.equalsIgnoreCase("XL")
                    || size.equalsIgnoreCase("XXL")
                  )
                 && this.material.equals("cotton")
               )
                ? getUnitPrice() * 115 / 100  :  getUnitPrice();
    }
}
