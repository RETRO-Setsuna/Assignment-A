import java.util.ArrayList;

class Shopping {
    private ArrayList<Chocolate> cart;

    Shopping() {
        cart = new ArrayList<Chocolate>();
    }

    void addToCart(Chocolate chocolate) {
        cart.add(chocolate);
        System.out.println(chocolate.getName() + " added to cart.");
    }

    void displayCart() {
        System.out.println("My Cart");

        if (cart.size() == 0) {
            System.out.println("Your cart is empty.");
        } else {
            for (Chocolate chocolate : cart) {
                System.out.println(chocolate);
            }
        }
    }
}