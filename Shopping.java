import java.util.ArrayList;

class Shopping {
    private ArrayList<Chocolate> cart;
    private OrderStatus orderStatus;

    Shopping() {
        cart = new ArrayList<Chocolate>();
        orderStatus = OrderStatus.NO_ORDER;
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

        if (cart.isEmpty()) {
            System.out.println("Your cart is empty.");
        } else {
            for (Chocolate chocolate : cart) {
                System.out.println(chocolate);
            }

            System.out.println("Total: $" + calculateTotal());
        }
    }

    void checkout() {
        if (cart.isEmpty()) {
            System.out.println("Your cart is empty.");
            return;
        }

        double total = calculateTotal();
        PaymentMethod paymentMethod = choosePaymentMethod();
        Delivery delivery = chooseDelivery();

        orderStatus = OrderStatus.PENDING;

        System.out.println();
        System.out.println("Checkout Summary");
        System.out.println("Total Price: $" + total);
        System.out.println("Payment Method: " + paymentMethod);
        System.out.println("Delivery Option: " + delivery);
        System.out.println("Order placed successfully.");
    }

    void viewOrderStatus() {
        if (orderStatus == OrderStatus.NO_ORDER) {
            System.out.println("No order has been placed.");
        } else {
            System.out.println("Current Order Status: " + orderStatus);
        }
    }

    double calculateTotal() {
        double total = 0;

        for (Chocolate chocolate : cart) {
            total = total + chocolate.getPrice();
        }

        return total;
    }

    PaymentMethod choosePaymentMethod() {
        System.out.println();
        System.out.println("Choose Payment Method");
        System.out.println("1. Cash");
        System.out.println("2. Card");
        System.out.println("3. Transfer");
        System.out.print("Select an option: ");

        int choice = In.nextInt();

        if (choice == 1) {
            return PaymentMethod.CASH;
        } else if (choice == 2) {
            return PaymentMethod.CARD;
        } else if (choice == 3) {
            return PaymentMethod.TRANSFER;
        } else {
            System.out.println("Invalid option. Transfer selected.");
            return PaymentMethod.TRANSFER;
        }
    }

    Delivery chooseDelivery() {
        System.out.println();
        System.out.println("Choose Delivery Option");
        System.out.println("1. Pick Up");
        System.out.println("2. Delivery");
        System.out.print("Select an option: ");

        int choice = In.nextInt();

        if (choice == 1) {
            return Delivery.PICK_UP;
        } else if (choice == 2) {
            return Delivery.DELIVERY;
        } else {
            System.out.println("Invalid option. Pick up selected.");
            return Delivery.PICK_UP;
        }
    }
}

// have to make
// 2. view order status

// 4. delete from cart:
// 5. check out cash/card/transfer
// 6. delivery pick up
// in here