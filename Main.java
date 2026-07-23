class Main {
    public static void main(String[] args) {

        HDChocoShop shop = new HDChocoShop();

        // chocolates for testing
        shop.getInventory().addChocolate(
                new Chocolate("C001", "Milk Chocolate", 10.0, Size.M, Sweetness.FIFTY, Types.MILK_CHOCOLATE,
                        Fillings.CARAMEL, Toppings.OREO));

        shop.getInventory().addChocolate(
                new Chocolate("C002", "Dark Chocolate", 12.0, Size.L, Sweetness.TWENTY_FIVE, Types.DARK_CHOCOLATE,
                        Fillings.NUTS, Toppings.EXTRA_CHOCOLATE));

        Menu menu = new Menu(shop);
        menu.runMenu();
    }
}