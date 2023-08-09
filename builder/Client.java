public class Client {
    public static void main(String[] args) {
        burgers burger = new burgers.Builder()
                .withBread("Whole Wheat")
                .withMeat("Beef")
                .withLettuce("Iceberg")
                .withTomato("Roma")
                .withCheese("Cheddar")
                .build();

        System.out.println(burger);
    }
}