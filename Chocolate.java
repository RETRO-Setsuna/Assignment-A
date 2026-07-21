enum Size {
    S, M, L, XL;
}

enum Delivery {
    PICK_UP, DELIVERY;
}

enum FILLINGS {
}

enum Sweetness {
    ZERO(0), TWENTY_FIVE(25), FIFTY(50), SEVENTY_FIVE(75), HUNDRED(100);

    private int percentage;

    Sweetness(int percentage) {
        this.percentage = percentage;
    }

    public int getPercentage() {
        return percentage;
    }
}

enum Toppings {
}

enum Types {
    WHITE_CHOCOLATE, DARK_CHOCOLATE, MILK_CHOCOLATE, COOKIE_AND_CREAM;
}

enum PaymentMethod {
    CASH, CARD, TRANSFER;
}

enum OrderStatus {
    PENDING, CONFIRMED, PREPARING, READU_FOR_PICKUP, OUT_FOR_DELIVERY, COMPLETE;

}

class Chocolate {
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

class Main {
    public static void main(String[] args) {
        Menu menu = new Menu();
        menu.runMenu();
    }
}