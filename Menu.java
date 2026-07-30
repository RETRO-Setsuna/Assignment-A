class Menu {
    private HDChocoShop shop;

    Menu(HDChocoShop shop) {
        this.shop = shop;
    }

    void runMenu() {

        boolean running = true;

        while (running) {

            System.out.println();
            System.out.println(" Welcome to HD Choco Shop!!!!!!!!!!!!!");
            System.out.println();
            System.out.println("1. Customer");
            System.out.println("2. Staff");
            System.out.println("3. Exit");
            System.out.println();
            System.out.print("Select an option: ");

            int choice = In.nextInt();

            if (choice == 1) {
                customerMenu();
            } else if (choice == 2) {
                shop.staffAccess();
            } else if (choice == 3) {
                System.out.println("Thank you for visiting HD Choco Shop!");
                running = false;
            } else {
                System.out.println("Invalid option.");
            }
        }
    }

    void customerMenu() {

        boolean running = true;

        while (running) {

            System.out.println();
            System.out.println();
            System.out.println("1. Membership Sign Up");
            System.out.println("2. Membership Sign In");
            System.out.println("3. Search Chocolate");
            System.out.println("4. Sort Chocolate");
            System.out.println("5. Build Your Chocolate");
            System.out.println("6. My Cart");
            System.out.println("7. Return");
            System.out.println();
            System.out.print("Select an option: ");

            int choice = In.nextInt();

            if (choice == 1) {
                shop.membershipSignUp();
            } else if (choice == 2) {
                shop.membershipSignIn();
            } else if (choice == 3) {
                shop.searchChocolate();
            } else if (choice == 4) {
                shop.sortChocolate();
            } else if (choice == 5) {
                shop.buildChocolate();
            } else if (choice == 6) {
                shop.cartMenu();
            } else if (choice == 7) {
                running = false;
            } else {
                System.out.println("Invalid option.");
            }
        }
    }
}