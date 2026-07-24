import java.util.ArrayList;
import java.util.HashMap;
import javax.swing.text.html.StyleSheet;

//STAFF ONLY

class Inventory {

    private ArrayList<Chocolate> chocolates;

    Inventory() {
        chocolates = new ArrayList<Chocolate>();
    }

    void addChocolate(Chocolate c) {
        chocolates.add(c);
    }

    void addChocolate(String id, String name, double price, Size size, Sweetness sweetness, Types type,
            Fillings filling, Toppings topping) {
        Chocolate c = new Chocolate(id, name, price, size, sweetness, type, filling, topping);

        chocolates.add(c);
    }

    void displayChocolate() {

        for (Chocolate choco : chocolates) {
            System.out.println(choco);
        }
    }

    Chocolate searchChocolate(String chocoName) {
        for (Chocolate c : chocolates) {
            if (chocoName.equals(c.getName())) {
                return c;
            }
        }
        return null;
    }
}

//staff update?
// order status here?

enum Status {
    PREPARING, PACKING, DELIVERING, RECEIEVING, DELIVERED
}

class statusUpdater() {


    
    void staffUpdateStat(Status statusType) {
        if (statusType.equals(Status.PREPARING) {
            System.out.println("Your order is currently being Prepared");
        } else if (statusType.equals(Status.DELIVERING)) {
            System.out.println("Your order is currently begining Delivered to you!");
        } else if (statusType.equals(Status.PACKING)) {
            System.out.println("Your ordering is currently being Packaged");
        } else if (statusType.equals(Status.RECEIEVING)) {
            System.out.println("Your order is currently being processed");
        } else if (statusType.equals(Status.DELIVERED)) {
            System.out.println("Your order has arrived!");
        } else {
            System.out.println("Error.");
        }
    }
}

