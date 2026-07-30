import java.util.ArrayList;
import java.util.HashMap;

class HDChocoShop {
    private Inventory inventory;
    private Shopping shopping;
    private StaffManager staffManager;

    private boolean memberSignedIn;
    private ListOfUsers users;

    HDChocoShop() {
        inventory = new Inventory();
        shopping = new Shopping();

        memberSignedIn = false;

        users = new ListOfUsers(
                new HashMap<Usernames, Passwords>(),
                new ArrayList<>());

        staffManager = new StaffManager(inventory, shopping);
    }

    void staffAccess() {
        staffManager.staffAccess();
    }

    Inventory getInventory() {
        return inventory;
    }

    void membershipSignIn() {
        System.out.println("Membership Sign In");
        System.out.println();

        System.out.print("Enter your Username: ");
        String name = In.nextLine();

        System.out.print("Enter your Password: ");
        String pass = In.nextLine();

        memberSignedIn = users.SignIn(name, pass);

        if (memberSignedIn) {
            System.out.println("Welcome back, " + name + "!");
            System.out.println("Members can receive 10% discount!");
        }
    }

    void membershipSignUp() {
        System.out.println("Membership Sign Up");
        System.out.println();

        System.out.print("Create a Username: ");
        String accName = In.nextLine();

        System.out.print("Create your Password: ");
        String accPass = In.nextLine();

        users.SignUp(accName, accPass);

        memberSignedIn = users.SignIn(accName, accPass);

        System.out.println("Welcome " + accName + "!");
        System.out.println("Members can receive 10% discount!");
        System.out.println();
    }

    void searchChocolate() {
        System.out.println();
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

    void buildChocolate() {
        System.out.println();
        System.out.println("Build Your Chocolate");
        System.out.println();

        System.out.print("Enter chocolate name: ");
        String name = In.nextLine();

        // Chocolate type
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
                System.out.println("Invalid number. Please choose again.");
            }
        }

        // Size
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
                System.out.println("Invalid number. Please choose again.");
            }
        }

        // Sweetness
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
                System.out.println("Invalid number. Please choose again.");
            }
        }

        // Filling
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
                System.out.println("Invalid number. Please choose again.");
            }
        }

        // Topping
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
                System.out.println("Invalid number. Please choose again.");
            }
        }

        // Price
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

        String productName = "CUSTOM-" + name;

        Chocolate customChocolate = new CustomChocolate(productName, name, price, size, sweetness, type, filling,
                topping);

        System.out.println();
        System.out.println("Your chocolate has been created.");
        customChocolate.displayChocolate();
        System.out.println("Price: $" + customChocolate.getPrice());

        shopping.addToCart(customChocolate);
    }

    void sortChocolate() {
        SortingABC abc = new SortingABC();
        SortingPrice price = new SortingPrice();

        System.out.println();
        System.out.println("Sort Chocolate");
        System.out.println();
        System.out.println("1. Alphabetical");
        System.out.println("2. Price");
        System.out.println("3. Return");
        System.out.println();
        System.out.print("Select an option: ");

        int choice = In.nextInt();

        if (choice == 1) {
            abc.sortChocolate(inventory.getChocolates());
        } else if (choice == 2) {
            price.sortChocolate(inventory.getChocolates());
        } else if (choice == 3) {
            return;
        } else {
            System.out.println("Invalid option.");
        }
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
            System.out.println();
            System.out.println("1. View Cart");
            System.out.println("2. Delete From Cart");
            System.out.println("3. Checkout");
            System.out.println("4. View Order Status");
            System.out.println("5. Return");
            System.out.println();
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
}