public class OnlineOrders implements Orderable {
    private ShoppingCart cart;

    public OnlineOrders(ShoppingCart cart) {
        this.cart = cart;
    }

    @Override
    public void placeOrder() {
        double total = cart.calculateTotal(new PercentDiscount());
        System.out.println("Online order placed. Total: " + total);
    }
}