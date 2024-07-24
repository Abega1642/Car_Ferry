package mg.training.exo7;

import java.util.ArrayList;

public class Shop {
    private ArrayList<Products> productsList;

    public Shop(ArrayList<Products> productsList) {
        this.productsList = productsList;
    }

    public ArrayList<Products> getProductsList() {
        return productsList;
    }

    public void setProductsList(ArrayList<Products> productsList) {
        this.productsList = productsList;
    }
    public void addProduct(Products product) {
        productsList.add(product);
    }
    public void displayProducts() {
        productsList.forEach(System.out::println);
    }

    public static void main(String[] args) {
        Electronics smartPhone = new Electronics(1, "iPhone ?", "? Generation of iPhone", 1500d, "Apple", 0.5d);
        Clothes tShirt = new Clothes(1, "T-Shirt", "Comfortable T-shirt", 100d, "L", "cotton");
        ArrayList<Products> products = new ArrayList<>();

        // Creating a shop;
        Shop shop = new Shop(products);

        // Adding some products;
        shop.addProduct(smartPhone);
        shop.addProduct(tShirt);

        System.out.println("--- Displaying all products in the shop :");
        shop.displayProducts();
    }
}
