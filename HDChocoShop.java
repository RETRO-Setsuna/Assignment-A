class HDChocoShop {
    private Inventory inventory;
    private Shopping shopping;
    private Users user;
    private boolean memberSignedIn;

    HDChocoShop() {
        inventory = new Inventory();
        shopping = new Shopping();
        user = new Users("Guest", "Not provided");
        memberSignedIn = false;
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
            System.out.println("5. Change Customer order status");
            System.out.println("6. Sort Chocolate");
            System.out.println("7. Return");
            System.out.println();
            System.out.print("Select an option: ");

            int staffSelect = In.nextInt();

            if (staffSelect == 1) {
                inventory.displayChocolate();

            } else if (staffSelect == 2) {
                addChocolate();

            } else if (staffSelect == 3) {
                removeChocolate();

            } else if (staffSelect == 4) {
                searchChocolate();
            } else if (staffSelect == 5) {
                System.out.println();
                System.out.println("Update Order Status");
                System.out.println("1. Confirmed");
                System.out.println("2. Preparing");
                System.out.println("3. Ready for Pickup");
                System.out.println("4. Out for Delivery");
                System.out.println("5. Complete");
                System.out.print("Select an option: ");

                int choice = In.nextInt();

                if (choice == 1) {
                    shopping.staffUpdateStatus(OrderStatus.CONFIRMED);
                } else if (choice == 2) {
                    shopping.staffUpdateStatus(OrderStatus.PREPARING);
                } else if (choice == 3) {
                    shopping.staffUpdateStatus(OrderStatus.READY_FOR_PICKUP);
                } else if (choice == 4) {
                    shopping.staffUpdateStatus(OrderStatus.OUT_FOR_DELIVERY);
                } else if (choice == 5) {
                    shopping.staffUpdateStatus(OrderStatus.COMPLETE);
                } else {
                    System.out.println("Invalid option.");
                }

            } else if (staffSelect == 6) {
                SortingABC abc = new SortingABC();
                SortingPrice price = new SortingPrice();

                System.out.println("Sort Chocolate");
                System.out.println();
                System.out.println("1. Alphabetical");
                System.out.println("2. Price");
                System.out.println();
                System.out.print("Select an option: ");

                int choice = In.nextInt();

                if (choice == 1) {
                    abc.sortChocolate(inventory.getChocolates());
                } else if (choice == 2) {
                    price.sortChocolate(inventory.getChocolates());
                }

            } else if (staffSelect == 7) {
                running = false;

            } else {
                System.out.println("Invalid option.");
            }
        }

    }

    void membershipSignIn() {
        System.out.println("Membership Sign In");
        System.out.println();
        System.out.print("Enter your name: ");
        String name = In.nextLine();

        System.out.print("Enter your phone number: ");
        String phoneNumber = In.nextLine();

        user = new Users(name, phoneNumber);
        memberSignedIn = true;
        System.out.println("Welcome, " + user.getName() + "!");
        System.out.println("Members can receive 10% discount!");
        System.out.println();
    }

    void searchChocolate() {
        System.out.println("Search Chocolate");
        System.out.println();

        System.out.print("Enter chocolate name to search: ");
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

        System.out.println();
        System.out.println("Choose Chocolate Type");
        System.out.println("1. White Chocolate");
        System.out.println("2. Dark Chocolate");
        System.out.println("3. Milk Chocolate");
        System.out.println("4. Cookie and Cream");
        System.out.print("Select an option: ");

        int typeChoice = In.nextInt();

        Types type;

        if (typeChoice == 1) {
            type = Types.WHITE_CHOCOLATE;
        } else if (typeChoice == 2) {
            type = Types.DARK_CHOCOLATE;
        } else if (typeChoice == 3) {
            type = Types.MILK_CHOCOLATE;
        } else {
            type = Types.COOKIE_AND_CREAM;
        }

        System.out.println();
        System.out.println("Choose Size");
        System.out.println("1. Small");
        System.out.println("2. Medium");
        System.out.println("3. Large");
        System.out.println("4. Extra Large");
        System.out.print("Select an option: ");

        int sizeChoice = In.nextInt();

        Size size;

        if (sizeChoice == 1) {
            size = Size.S;
        } else if (sizeChoice == 2) {
            size = Size.M;
        } else if (sizeChoice == 3) {
            size = Size.L;
        } else {
            size = Size.XL;
        }

        System.out.println();
        System.out.println("Choose Sweetness");
        System.out.println("1. 0%");
        System.out.println("2. 25%");
        System.out.println("3. 50%");
        System.out.println("4. 75%");
        System.out.println("5. 100%");
        System.out.print("Select an option: ");

        int sweetnessChoice = In.nextInt();

        Sweetness sweetness;

        if (sweetnessChoice == 1) {
            sweetness = Sweetness.ZERO;
        } else if (sweetnessChoice == 2) {
            sweetness = Sweetness.TWENTY_FIVE;
        } else if (sweetnessChoice == 3) {
            sweetness = Sweetness.FIFTY;
        } else if (sweetnessChoice == 4) {
            sweetness = Sweetness.SEVENTY_FIVE;
        } else {
            sweetness = Sweetness.HUNDRED;
        }

        System.out.println();
        System.out.println("Choose Filling");
        System.out.println("1. Caramel");
        System.out.println("2. Nuts");
        System.out.println("3. Fruits");
        System.out.print("Select an option: ");

        int fillingChoice = In.nextInt();

        Fillings filling;

        if (fillingChoice == 1) {
            filling = Fillings.CARAMEL;
        } else if (fillingChoice == 2) {
            filling = Fillings.NUTS;
        } else {
            filling = Fillings.FRUITS;
        }

        System.out.println();
        System.out.println("Choose Topping");
        System.out.println("1. Fruits");
        System.out.println("2. Oreo");
        System.out.println("3. Candy Pop");
        System.out.println("4. Extra Chocolate");
        System.out.print("Select an option: ");

        int toppingChoice = In.nextInt();

        Toppings topping;

        if (toppingChoice == 1) {
            topping = Toppings.FRUITS;
        } else if (toppingChoice == 2) {
            topping = Toppings.OREO;
        } else if (toppingChoice == 3) {
            topping = Toppings.CANDY_POP;
        } else {
            topping = Toppings.EXTRA_CHOCOLATE;
        }

        inventory.addChocolate(id, name, price, size, sweetness, type, filling, topping);

        System.out.println("Chocolate added successfully.");

    }

    void buildChocolate() {
        System.out.println("Build Your Chocolate");

        System.out.print("Enter chocolate name: ");
        String name = In.nextLine();
        System.out.println();
        System.out.println("Choose Chocolate Type");
        System.out.println("1. White Chocolate");
        System.out.println("2. Dark Chocolate");
        System.out.println("3. Milk Chocolate");
        System.out.println("4. Cookie and Cream");
        System.out.print("Select an option: ");
        int typeChoice = In.nextInt();

        Types type;

        if (typeChoice == 1) {
            type = Types.WHITE_CHOCOLATE;
        } else if (typeChoice == 2) {
            type = Types.DARK_CHOCOLATE;
        } else if (typeChoice == 3) {
            type = Types.MILK_CHOCOLATE;
        } else {
            type = Types.COOKIE_AND_CREAM;
        }

        // size
        System.out.println();
        System.out.println("Choose Size");
        System.out.println("1. Small");
        System.out.println("2. Medium");
        System.out.println("3. Large");
        System.out.println("4. Extra Large");
        System.out.print("Select an option: ");

        int sizeChoice = In.nextInt();

        Size size;

        if (sizeChoice == 1) {
            size = Size.S;
        } else if (sizeChoice == 2) {
            size = Size.M;
        } else if (sizeChoice == 3) {
            size = Size.L;
        } else {
            size = Size.XL;
        }

        // sweetness
        System.out.println();
        System.out.println("Choose Sweetness");
        System.out.println("1. 0%");
        System.out.println("2. 25%");
        System.out.println("3. 50%");
        System.out.println("4. 75%");
        System.out.println("5. 100%");
        System.out.print("Select an option: ");

        int sweetnessChoice = In.nextInt();

        Sweetness sweetness;

        if (sweetnessChoice == 1) {
            sweetness = Sweetness.ZERO;
        } else if (sweetnessChoice == 2) {
            sweetness = Sweetness.TWENTY_FIVE;
        } else if (sweetnessChoice == 3) {
            sweetness = Sweetness.FIFTY;
        } else if (sweetnessChoice == 4) {
            sweetness = Sweetness.SEVENTY_FIVE;
        } else {
            sweetness = Sweetness.HUNDRED;
        }

        // filling
        System.out.println();
        System.out.println("Choose Filling");
        System.out.println("1. Caramel");
        System.out.println("2. Nuts");
        System.out.println("3. Fruits");
        System.out.print("Select an option: ");

        int fillingChoice = In.nextInt();

        Fillings filling;

        if (fillingChoice == 1) {
            filling = Fillings.CARAMEL;
        } else if (fillingChoice == 2) {
            filling = Fillings.NUTS;
        } else {
            filling = Fillings.FRUITS;
        }

        // topping
        System.out.println();
        System.out.println("Choose Topping");
        System.out.println("1. Fruits");
        System.out.println("2. Oreo");
        System.out.println("3. Candy Pop");
        System.out.println("4. Extra Chocolate");
        System.out.print("Select an option: ");

        int toppingChoice = In.nextInt();

        Toppings topping;

        if (toppingChoice == 1) {
            topping = Toppings.FRUITS;
        } else if (toppingChoice == 2) {
            topping = Toppings.OREO;
        } else if (toppingChoice == 3) {
            topping = Toppings.CANDY_POP;
        } else {
            topping = Toppings.EXTRA_CHOCOLATE;
        }

        double price = 10.00;

        if (size == Size.M) {
            price = price + 2.00;
        } else if (size == Size.L) {
            price = price + 4.00;
        } else if (size == Size.XL) {
            price = price + 6.00;
        }

        if (topping == Toppings.EXTRA_CHOCOLATE) {
            price = price + 2.00;
        }

        String productName = "CUSTOM- " + name;

        Chocolate customChocolate = new CustomChocolate(productName, name, price, size, sweetness, type, filling,
                topping);

        System.out.println();
        System.out.println("Your chocolate has been created.");
        customChocolate.displayChocolate();
        System.out.println("Price: $" + customChocolate.getPrice());

        shopping.addToCart(customChocolate);
    }

    void viewCart() {
        shopping.displayCart();
    }

    void viewOrderStatus() {
        shopping.viewOrderStatus();
    }

    void checkout() {
        shopping.checkout(memberSignedIn);
    }

    void deleteFromCart() {
        shopping.deleteFromCart();
    }

    void cartMenu() {
        boolean running = true;

        while (running) {
            System.out.println();
            System.out.println("My Cart Menu");
            System.out.println("1. View Cart");
            System.out.println("2. Delete From Cart");
            System.out.println("3. Checkout");
            System.out.println("4. View Order Status");
            System.out.println("5. Return");
            System.out.print("Select an option: ");

            int choice = In.nextInt();

            if (choice == 1) {
                viewCart();
            } else if (choice == 2) {
                deleteFromCart();
            } else if (choice == 3) {
                checkout();
            } else if (choice == 4) {
                viewOrderStatus();
            } else if (choice == 5) {
                running = false;
            } else {
                System.out.println("Invalid option.");
            }
        }
    }

    void removeChocolate() {
        System.out.println("Remove Chocolate");
        System.out.println();

        inventory.displayChocolate();

        System.out.print("Enter chocolate name to remove: ");
        String name = In.nextLine();

        inventory.removeChocolate(name);
    }
}