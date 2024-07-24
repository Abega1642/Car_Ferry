package mg.training.exo7;

import java.util.ArrayList;
import java.util.List;

public class ShopN {
    private List<Object> list = new ArrayList<>();

    public ShopN() {};

    public ShopN(List<Object> list) {
        this.list = list;
    }

    public List<Object> getList() {
        return list;
    }
    public void setList(List<Object> list) {
        this.list = list;
    }

    public void addProduct(Object product) {
        list.add(product);
    }
    public void displayProduct() {
        for(Object o : this.list) {
            System.out.println(o.toString());
        }
    }

    public static void main(String[] args) {
        ElectronicsN pc = new ElectronicsN(1, "MAC Book", "This is a mac book", 2000d, "Apple", 1);
        ClothesN chemise = new ClothesN(1, "Chemise", "This is a chemise", 150, "L", "cotton");
        List<Object> products = new ArrayList<>();
        products.add(pc);
        products.add(chemise);
        ShopN shopN = new ShopN(products);
        shopN.displayProduct();
    }

}
