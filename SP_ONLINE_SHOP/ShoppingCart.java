import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    private List<Product> items = new ArrayList<>();

    public void addProduct(Product product) {
        items.add(product);
    }

    public double calculateTotal(Discount discountStrategy) {
        double total = 0;
        for (Product item : items) {
            total += item.getPrice();
        }
        return discountStrategy.applyDiscount(total);
    }
}