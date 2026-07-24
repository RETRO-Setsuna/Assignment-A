class Menu {
    private HDChocoShop shop;

    Menu(HDChocoShop shop) {
        this.shop = shop;
    }

    void runMenu() {
        System.out.println("Welcome to HD Chocolate Factory!");
        System.out.println("Please select a option from below");
        while (true) {
            System.out.println("1. Membership Sign in");
            System.out.println("2. Search for a Chocolate");
            System.out.println("3. Build a Chocolate");
            System.out.println("4. My cart");
            System.out.println("5. Checkout");
            System.out.println("6. View Order Status");
            System.out.println("7. Staff access");
            System.out.println("8. Exit");

            int userSelect = In.nextInt();

            if (userSelect == 1) {
                shop.membershipSignIn();
            } else if (userSelect == 2) {
                shop.searchChocolate();
            } else if (userSelect == 3) {
                shop.buildChocolate();
            } else if (userSelect == 4) {
                shop.viewCart();
            } else if (userSelect == 5) {
                shop.checkout();
            } else if (userSelect == 6) {
                shop.viewOrderStatus();
            } else if (userSelect == 7) {
                shop.staffAccess();
            } else if (userSelect == 8) {
                System.out.println("Thank you for visiting our HD Chocolat ");
                break;
            } else {
                System.out.println("Invalid number. Please select a number from 1 to 8.");
            }

        }

    }
}
