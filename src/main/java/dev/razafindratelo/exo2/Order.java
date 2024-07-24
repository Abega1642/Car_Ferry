package mg.training.exo2;

import java.util.List;

public class Order {
    private String clientName;
    private List<OrderItem> article;

    public double getSum() {
        return article.stream().map(OrderItem::getTotal).reduce( 0.0, Double::sum);
    }

    public String getClientName() {
        return clientName;
    }

    public List<OrderItem> getArticle() {
        return article;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public void setArticle(List<OrderItem> article) {
        this.article = article;
    }

    public Order(String clientName, List<OrderItem> article) {
        this.clientName = clientName;
        this.article = article;
    }
}
