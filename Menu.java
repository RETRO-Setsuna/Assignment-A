class Menu {
    boolean running;
    Chocolate chocolate;
    HDChocoShop shop;

    Menu() {
        this.running = true;
        this.chocolate = new Chocolate();
        this.shop = new HDChocoShop();

    }

    void runMenu() {
        while (running == true)

        {
            System.out.println("Welcome to HD Chocolate Factory!");
            System.out.println("Please select a option from below");
            System.out.println("1. Membership Sign in");
            System.out.println("2. Search for a Chocolate");
            System.out.println("3. Build a Chocolate");
            System.out.println("4. My cart");
            System.out.println("5. View Order Status");
            System.out.println("6.Staff acces");
            System.out.println("7. Exit");

            int userSelect = In.nextInt();

            if (userSelect == 1) {
                chocolate.membershipSignIn();
            } else if (userSelect == 2) {
                chocolate.searchChocolate();
            } else if (userSelect == 3) {
                chocolate.buildChocolate();
            } else if (userSelect == 4) {
                chocolate.viewCart();
            } else if (userSelect == 5) {
                chocolate.viewOrderStatus();
            } else if (userSelect == 6) {
                shop.staffAccess();
            } else if (userSelect == 7) {
                running = false;
                System.out.println("Thank you for visiting HD chocolate Factory");
            } else {
                System.out.println("Invalid option. Please select a number from 1 to 6");

            }

        }

    }
}
