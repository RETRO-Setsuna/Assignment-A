class StaffManager {
    private Inventory inventory;
    private Shopping shopping;

    StaffManager(Inventory inventory, Shopping shopping) {
        this.inventory = inventory;
        this.shopping = shopping;

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

    void staffInventoryMenu() {
        boolean running = true;
        while (running) {
            System.out.println();
            System.out.println("Staff Inventory Menu");
            System.out.println();
            System.out.println("1. Display Inventory");
            System.out.println("2. Add Chocolate");
            System.out.println("3. Remove Chocolate");
            System.out.println("4. Search Chocolate");
            System.out.println("5. Change Customer order status");
            System.out.println("6. Return");
            System.out.println();
            System.out.print("Select an option: ");

            int staffSelect = In.nextInt();

            while (staffSelect < 1 || staffSelect > 6) {
                System.out.println("Invalid option. Please select from 1 to 6.");
                System.out.print("Select an option: ");

                staffSelect = In.nextInt();
            }
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
                System.out.println();

                System.out.println();
                System.out.println("1. Confirmed");
                System.out.println("2. Preparing");
                System.out.println("3. Ready for Pickup");
                System.out.println("4. Out for Delivery");
                System.out.println("5. Complete");
                System.out.println("6. Return");
                System.out.println();
                System.out.print("Select an option: ");

                int choice = In.nextInt();

                while (choice < 1 || choice > 6) {
                    System.out.println("Invalid option. Please select from 1 to 6.");
                    System.out.print("Select an option: ");
                    choice = In.nextInt();
                }
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
                } else if (choice == 6) {
                    continue;
                }

            } else if (staffSelect == 6) {
                running = false;

            }
        }

    }

    void searchChocolate() {
        System.out.println("Search Chocolate");
        System.out.println();

        System.out.print("Enter Product ID to search: ");
        String productId = In.nextLine();

        Chocolate foundChocolate = inventory.searchChocolateById(productId);

        if (foundChocolate != null) {
            System.out.println("Chocolate found:");
            System.out.println(foundChocolate);
        } else {
            System.out.println("Chocolate not found.");
        }
    }

    void addChocolate() {
        System.out.println();
        System.out.println("Add Chocolate");
        System.out.println();

        String id;

        while (true) {
            System.out.print("Enter Product ID: ");
            id = In.nextLine();

            if (id.isEmpty()) {
                System.out.println("Product ID cannot be empty.");
            } else if (inventory.productIdExists(id)) {
                System.out.println("Product ID already exists.");
            } else {
                break;
            }
        }

        String name;

        while (true) {
            System.out.print("Enter chocolate name: ");
            name = In.nextLine();

            if (name.isEmpty()) {
                System.out.println("Chocolate name cannot be empty.");
            } else if (inventory.chocolateNameExists(name)) {
                System.out.println("Chocolate name already exists.");
            } else {
                break;
            }
        }

        double price = 0;

        while (price <= 0) {
            System.out.print("Enter price: ");
            price = In.nextDouble();

            if (price <= 0) {
                System.out.println("Price must be greater than 0.");
            }
        }

        Types type = null;

        while (type == null) {
            System.out.println();
            System.out.println("Choose Chocolate Type");
            System.out.println();
            System.out.println("1. White Chocolate");
            System.out.println("2. Dark Chocolate");
            System.out.println("3. Milk Chocolate");
            System.out.println("4. Cookie and Cream");
            System.out.println();
            System.out.print("Select an option: ");

            int typeChoice = In.nextInt();

            if (typeChoice == 1) {
                type = Types.WHITE_CHOCOLATE;
            } else if (typeChoice == 2) {
                type = Types.DARK_CHOCOLATE;
            } else if (typeChoice == 3) {
                type = Types.MILK_CHOCOLATE;
            } else if (typeChoice == 4) {
                type = Types.COOKIE_AND_CREAM;
            } else {
                System.out.println("Invalid option. Please choose again.");
            }
        }

        Size size = null;

        while (size == null) {
            System.out.println();
            System.out.println("Choose Size");
            System.out.println();
            System.out.println("1. Small");
            System.out.println("2. Medium");
            System.out.println("3. Large");
            System.out.println("4. Extra Large");
            System.out.println();
            System.out.print("Select an option: ");

            int sizeChoice = In.nextInt();

            if (sizeChoice == 1) {
                size = Size.S;
            } else if (sizeChoice == 2) {
                size = Size.M;
            } else if (sizeChoice == 3) {
                size = Size.L;
            } else if (sizeChoice == 4) {
                size = Size.XL;
            } else {
                System.out.println("Invalid option. Please choose again.");
            }
        }

        Sweetness sweetness = null;

        while (sweetness == null) {
            System.out.println();
            System.out.println("Choose Sweetness");
            System.out.println();
            System.out.println("1. 0%");
            System.out.println("2. 25%");
            System.out.println("3. 50%");
            System.out.println("4. 75%");
            System.out.println("5. 100%");
            System.out.println();
            System.out.print("Select an option: ");

            int sweetnessChoice = In.nextInt();

            if (sweetnessChoice == 1) {
                sweetness = Sweetness.ZERO;
            } else if (sweetnessChoice == 2) {
                sweetness = Sweetness.TWENTY_FIVE;
            } else if (sweetnessChoice == 3) {
                sweetness = Sweetness.FIFTY;
            } else if (sweetnessChoice == 4) {
                sweetness = Sweetness.SEVENTY_FIVE;
            } else if (sweetnessChoice == 5) {
                sweetness = Sweetness.HUNDRED;
            } else {
                System.out.println("Invalid option. Please choose again.");
            }
        }

        Fillings filling = null;

        while (filling == null) {
            System.out.println();
            System.out.println("Choose Filling");
            System.out.println();
            System.out.println("1. None");
            System.out.println("2. Caramel");
            System.out.println("3. Nuts");
            System.out.println("4. Fruits");
            System.out.println();
            System.out.print("Select an option: ");

            int fillingChoice = In.nextInt();

            if (fillingChoice == 1) {
                filling = Fillings.NONE;
            } else if (fillingChoice == 2) {
                filling = Fillings.CARAMEL;
            } else if (fillingChoice == 3) {
                filling = Fillings.NUTS;
            } else if (fillingChoice == 4) {
                filling = Fillings.FRUITS;
            } else {
                System.out.println("Invalid option. Please choose again.");
            }
        }

        Toppings topping = null;

        while (topping == null) {
            System.out.println();
            System.out.println("Choose Topping");
            System.out.println();
            System.out.println("1. None");
            System.out.println("2. Fruits");
            System.out.println("3. Oreo");
            System.out.println("4. Candy Pop");
            System.out.println("5. Extra Chocolate");
            System.out.println();
            System.out.print("Select an option: ");

            int toppingChoice = In.nextInt();

            if (toppingChoice == 1) {
                topping = Toppings.NONE;
            } else if (toppingChoice == 2) {
                topping = Toppings.FRUITS;
            } else if (toppingChoice == 3) {
                topping = Toppings.OREO;
            } else if (toppingChoice == 4) {
                topping = Toppings.CANDY_POP;
            } else if (toppingChoice == 5) {
                topping = Toppings.EXTRA_CHOCOLATE;
            } else {
                System.out.println("Invalid option. Please choose again.");
            }
        }

        inventory.addChocolate(
                id, name, price, size, sweetness, type, filling, topping);

        System.out.println();
        System.out.println("Chocolate added successfully.");
    }

    void removeChocolate() {
        System.out.println("Remove Chocolate");
        System.out.println();

        inventory.displayChocolate();

        System.out.print("Enter Product ID to remove: ");
        String productId = In.nextLine();

        inventory.removeChocolate(productId);
    }

    @Override
    public String toString() {
        return "Staff Manager";
    }
}
