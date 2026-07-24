import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;


//sorting by alpophabetical order
class sortingABC {
    static final Comparator <Chocolate> comparator = Comparator.comparing(Chocolate::getName).thenComparing(Chocolate::getPrice);

    void sortChocolate(ArrayList<Chocolate> chocolates){
        Collections.sort(chocolates, comparator);

        for (Chocolate c : chocolates) {
            System.out.println(c);
        }
    }
}


//sort by price
class sortingPrice {
    static final Comparator <Chocolate> comparator = Comparator.comparing(Chocolate::getPrice).thenComparing(Chocolate::getType);

    void sortChocolate(ArrayList<Chocolate> chocolates) {
        Collections.sort(chocolates, comparator);

        for (Chocolate c : chocolates) {
            System.out.println(c);
        }
    }
}