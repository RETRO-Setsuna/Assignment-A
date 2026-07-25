import java.util.ArrayList;

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

    ArrayList<Chocolate> getChocolates() {
        return chocolates;
    }

    void removeChocolate(String chocoName) {
        for (int i = 0; i < chocolates.size(); i++) {
            if (chocoName.equals(chocolates.get(i).getName())) {
                Chocolate removedChocolate = chocolates.remove(i);

                System.out.println(removedChocolate.getName()
                        + " has been removed from the inventory.");
                return;
            }
        }

        System.out.println("Chocolate not found.");
    }
}
