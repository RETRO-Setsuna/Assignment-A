class Menu {
    private HDChocoShop shop;

    Menu(HDChocoShop shop) {
        this.shop = shop;
    }

    void runMenu() {
        System.out.println();
        System.out.println("Welcome to HD Chocolate Factory!!!!!!");
        System.out.println();
        System.out.println("Please select a option from below");
        System.out.println();
        while (true) {
            System.out.println();
            System.out.println("1. Membership Sign Up");
            System.out.println("2. Membership Sign in");
            System.out.println("3. Search for a Chocolate");
            System.out.println("4. Build a Chocolate");
            System.out.println("5. My cart (view / delete / checkout / order status)");
            System.out.println("6. Staff access");
            System.out.println("7. Exit");

            int userSelect = In.nextInt();

            if (userSelect == 1) {
                shop.membershipSignUp();
            } else if (userSelect == 2) {
                shop.membershipSignIn();
            } else if (userSelect == 3) {
                shop.searchChocolate();
            } else if (userSelect == 4) {
                shop.buildChocolate();
            } else if (userSelect == 5) {
                shop.cartMenu();
            } else if (userSelect == 6) {
                shop.staffAccess();
            } else if (userSelect == 7) {
                System.out.println("Thank you for visiting our HD Chocolate shop!!! ");
                break;
            } else {
                System.out.println("Invalid number. Please select a number from 1 to 7.");
            }

        }
    }
}