import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.HashMap;

class Inventory {

    private List<Chocolate> chocolates;
    private Map<String, Chocolate> chocolateMap;

    Inventory() {
        chocolates = new ArrayList<Chocolate>();
        chocolateMap = new HashMap<String, Chocolate>();
    }

    void addChocolate(Chocolate c) {
        chocolates.add(c);
        chocolateMap.put(c.getProductId(), c);
    }

    void addChocolate(String id, String name, double price, Size size, Sweetness sweetness, Types type,
            Fillings filling, Toppings topping) {

        Chocolate c = new NormalChocolate(id, name, price, size, sweetness, type,
                filling, topping);

        chocolates.add(c);
        chocolateMap.put(c.getProductId(), c);
    }

    void displayChocolate() {

        for (Chocolate choco : chocolates) {
            System.out.println(choco);
            System.out.println();
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

    List<Chocolate> getChocolates() {
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

    List<Chocolate> filterByType(Types type) {
        List<Chocolate> filteredChocolate = new ArrayList<>();

        for (Chocolate chocolate : chocolates) {
            if (chocolate.getType() == type) {
                filteredChocolate.add(chocolate);
            }
        }

        return filteredChocolate;
    }

    void searchByProductId(String productId) {

        if (chocolateMap.containsKey(productId)) {
            System.out.println("Chocolate found:");
            System.out.println(chocolateMap.get(productId));
            chocolateMap.get(productId).displayChocolate();
        } else {
            System.out.println("Chocolate not found.");
        }

    }
}
