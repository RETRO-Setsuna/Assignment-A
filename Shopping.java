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

    void deleteFromCart(Chocolate chocolate) {
        cart.remove(chocolate);
        System.out.println(chocolate.getName() + " has been removed from your cart");
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


    void checkTotal() {
        double cartTotal = 0;
        for(Chocolate c : cart) {
            cartTotal += c.getPrice();
        }
        System.out.println("Total: $" + cartTotal);
    }





}

// have to make 
//1.check out
//2. view order status
//3.  cart total check:
// 4. delete from cart:
// 5. check out cash/card/transfer
//6. delivery pick up
//in here