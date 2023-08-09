public class Client {
    public static void main(String[] args) {
        Product laptop = new Product("Tv", 1200);
        ShoppingCart cart = new ShoppingCart();
        cart.addProduct(laptop);
        Orderable onlineOrder = new OnlineOrders(cart);
        Orderable inStoreOrder = new InStoreOrders(cart);
        Notification emailNotification = new EmailNotification();
        Notification smsNotification = new SMSNotification();
        OrderProcessor emailOrderProcessor = new OrderProcessor(emailNotification);
        OrderProcessor smsOrderProcessor = new OrderProcessor(smsNotification);
        emailOrderProcessor.processOrder(onlineOrder);
        smsOrderProcessor.processOrder(inStoreOrder);
    }
}