class Main {
    public static void main(String[] args) {

        HDChocoShop shop = new HDChocoShop();

        shop.

        // chocolates for testing
        shop.getInventory().addChocolate(
                new NormalChocolate("C001", "Milk Chocolate", 10.0, Size.M, Sweetness.FIFTY, Types.MILK_CHOCOLATE,
                        Fillings.CARAMEL, Toppings.OREO));

        shop.getInventory().addChocolate(
                new CustomChocolate("C002", "Dark Chocolate", 12.0, Size.L, Sweetness.TWENTY_FIVE, Types.DARK_CHOCOLATE,
                        Fillings.NUTS, Toppings.EXTRA_CHOCOLATE));

        Menu menu = new Menu(shop);
        menu.runMenu();
    }
}

// Implement Method Overriding & Polymorphism
// Add an Interface
// Replace HashMap declaration with Map
// Map<String, Users> members = new HashMap<>();
// Improve toString() methods
// Add Filter feature // sub collection
