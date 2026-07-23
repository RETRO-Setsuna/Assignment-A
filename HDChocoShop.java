class HDChocoShop {
    private Inventory inventory;

    HDChocoShop() {
        inventory = new Inventory();
    }

    void staffAccess() {
        System.out.print("Enter staff PIN: ");
        int pin = In.nextInt();

        if (pin == 1234) {
            staffInventoryMenu();
        } else {
            System.out.println("Incorrect staff PIN.");
        }
    }

    Inventory getInventory() {
        return inventory;
    }

    void staffInventoryMenu() {
        System.out.println("Staff Inventory Menu");
        System.out.println("1. Display Inventory");
        System.out.println("2. Add Chocolate");
        System.out.println("3. Remove Chocolate");
        System.out.println("4. Search Chocolate");
        System.out.println("5. Return");
        System.out.println();
        System.out.println("Select an option: ");
        int staffSelect = In.nextInt();

        if (staffSelect == 1) {
            inventory.displayChocolate();

        } else if (staffSelect == 2) {
            System.out.println("Add Chocolate");

        } else if (staffSelect == 3) {
            System.out.println("Remove Chocolate");

        } else if (staffSelect == 4) {
            return;

        } else {
            System.out.println("Invalid option.");
        }
    }

    void membershipSignIn() {
        System.out.println("Membership Sign In");
    }

    void searchChocolate() {
        System.out.println("Enter Chocolate name");
        String name = In.nextLine();

        Chocolate foundChocolate = inventory.searchChocolate(name);

        if (foundChocolate != null) {
            System.out.println("Chocolate found:");
            System.out.println(foundChocolate);
        } else {
            System.out.println("Chocolate not found.");
        }
    }

    void buildChocolate() {
        System.out.println("Build a Chocolate");
    }

    void viewCart() {
        System.out.println("My Cart");
    }

    void viewOrderStatus() {
        System.out.println("View Order Status");
    }

}
