package mg.training.exo3;

public class Book {
    private String title;
    private Author author;
    private double price;
    private int quantity;
    public Book(String title, Author author, double price, int quantity) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.quantity = quantity;
    }
    public String getTitle() {
        return this.title;
    }
    public Author getAuthor() {
        return this.author;
    }
    public double getPrice() {
        return this.price;
    }
    public int getQuantity() {
        return this.quantity;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    public boolean isBroke() {
        return this.quantity == 0;
    }

    @Override
    public String toString() {
        return "Book {" +
                "title = '" + title + '\'' +
                ", author = '" + author + '\'' +
                ", price = " + price +
                ", quantity = " + quantity +
                '}';
    }
}
