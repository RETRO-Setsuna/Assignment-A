


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
        boolean running = true;
        while (running) {
            System.out.println("Staff Inventory Menu");
            System.out.println("1. Display Inventory");
            System.out.println("2. Add Chocolate");
            System.out.println("3. Remove Chocolate");
            System.out.println("4. Search Chocolate");
            System.out.println("5. Return");
            System.out.println();
            System.out.print("Select an option: ");

            int staffSelect = In.nextInt();

            if (staffSelect == 1) {
                inventory.displayChocolate();

            } else if (staffSelect == 2) {
                addChocolate();

            } else if (staffSelect == 3) {
                System.out.println("Remove Chocolate");

            } else if (staffSelect == 4) {
                searchChocolate();

            } else if (staffSelect == 5) {
                running = false;

            } else {
                System.out.println("Invalid option.");
            }
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

    void addChocolate() {
        System.out.print("Enter product ID: ");
        String id = In.nextLine();

        System.out.print("Enter chocolate name: ");
        String name = In.nextLine();

        System.out.print("Enter price: ");
        double price = In.nextDouble();

        inventory.addChocolate(id, name, price, Size.M, Sweetness.FIFTY, Types.MILK_CHOCOLATE, Fillings.CARAMEL,
                Toppings.OREO);

        System.out.println("Chocolate added successfully.");
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