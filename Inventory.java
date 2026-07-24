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

class statusUpdater {

    private String StatusMessage;

    void staffUpdateStat(Status statusType) {
        if (statusType.equals(Status.PREPARING) {
            this.StatusMessage = "Your order is currently being Prepared";
        } else if (statusType.equals(Status.DELIVERING)) {
            this.StatusMessage = "Your order is currently begining Delivered to you!";
        } else if (statusType.equals(Status.PACKING)) {
            this.StatusMessage = "Your ordering is currently being Packaged";
        } else if (statusType.equals(Status.RECEIEVING)) {
            this.StatusMessage = "Your order is currently being processed";
        } else if (statusType.equals(Status.DELIVERED)) {
            this.StatusMessage = "Your order has arrived!";
        } else {
            this.StatusMessage = "Error.";
        }
    }

    public String getStatusMessage() {
        return this.StatusMessage;
    }


    void changingOrderStat() {
        System.out.println("which chocolate's order status do you want to change?");
        String staffAns = In.nextLine();

        if (staffAns.equals(Status.DELIVERED)) {
            staffUpdateStat(Status.DELIVERED);
        } else if (staffAns.equals(Status.DELIVERING)) {
            staffUpdateStat(Status.DELIVERING);
        } else if (staffAns.equals(Status.PACKING)) {
            staffUpdateStat(Status.PACKING);
        } else if (staffAns.equals(Status.PREPARING)) {
            staffUpdateStat(Status.PREPARING);
        } else if (staffAns.equals(Status.RECEIEVING)) {
            staffUpdateStat(Status.RECEIEVING);
        }

    }

    

}

