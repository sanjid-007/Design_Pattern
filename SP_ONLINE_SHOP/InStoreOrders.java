public class InStoreOrders implements Orderable {
    private ShoppingCart cart;

    public InStoreOrders(ShoppingCart cart) {
        this.cart = cart;
    }

    @Override
    public void placeOrder() {
        double total = cart.calculateTotal(new PercentDiscount());
        System.out.println("In-store order placed. Total: " + total);
    }
}