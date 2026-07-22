import java.util.ArrayList;

//STAFF ONLY


class Inventory {

    ArrayList<Chocolate> chocolates;

    Inventory() {
        chocolates = new ArrayList<Chocolate>();
    }

    void addChocolate(Chocolate c) {
        chocolates.add(c);
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
