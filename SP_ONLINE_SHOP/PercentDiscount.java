public class PercentDiscount implements Discount {
    @Override
    public double applyDiscount(double price) {
        return price * 0.9;
    }
}