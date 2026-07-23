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

