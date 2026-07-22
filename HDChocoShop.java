class HDChocoShop {
    private Inventory inventory;

    HDChocoShop() {
        inventory = new Inventory();
    }

    void staffAccess() {
        System.out.print("Enter staff PIN: ");
        int pin = In.nextInt();

        if (pin == 0304) {
            staffInventoryMenu();
        } else {
            System.out.println("Incorrect staff PIN.");
        }
    }

    public Inventory getInventory() {
        return inventory;
    }

    void staffInventoryMenu() {
        System.out.println("Staff Inventory Menu");
        System.out.println("1. Display Inventory");
        System.out.println("2. Add Chocolate");
        System.out.println("3. Remove Chocolate");
        System.out.println("4. Return");
    }

    void membershipSignIn() {
        System.out.println("Membership Sign In");
    }

    void searchChocolate() {
        System.out.println("Search for a Chocolate");
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
