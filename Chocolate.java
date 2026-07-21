enum Size {
    S, M, L, XL;
}

enum Delivery {
    PICK_UP, DELIVERY;
}

enum Fillings {
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
    PENDING, CONFIRMED, PREPARING, READy_FOR_PICKUP, OUT_FOR_DELIVERY, COMPLETE;

}

class Chocolate {
    private String productId;
    private String name;
    private double price;
    private Size size;
    private Sweetness sweetness;
    private Types type;
    private Fillings filling;
    private Toppings topping;

    // constrcuter + get // have to put

    void displayChocolate() {
        // } have to put toString? hmmm
    }

}