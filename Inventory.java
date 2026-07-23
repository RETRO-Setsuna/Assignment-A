import java.util.ArrayList;

//STAFF ONLY

class Inventory {

    private ArrayList<Chocolate> chocolates;

    Inventory() {
        chocolates = new ArrayList<Chocolate>();
    }

    void addChocolate(Chocolate c) {
        chocolates.add(c);
    }

    void addChocolate(String id, String name, double price, Types type, Sweetness sweetness) {
        Chocolate c = new Chocolate(id, name, price, type, sweetness);

    }

    void displayChocolate() {
        ///////
        for (Chocolate choco : chocolates) {
            System.out.println(choco);
        }
    }

    Chocolate searchChocolate(String chocoName) {
        ///////// fix
        for (Chocolate c : chocolates) {
            if chocoName.equals(Chocolate /* c.name */) {
                return "chocolate found";
        } else {
            return "Nothing found"; //Return nothing yet
        }
    }

}
}
