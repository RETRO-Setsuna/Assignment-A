import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;

class sortingABC {
    static final Comparator<Chocolate> comparator = Comparator.comparing(Chocolate::productName).thenComparing(Chocolate::productID);

    Collections.sort(ArrayList, Chocolate.comparator);

    for (Chocolate c : ArrayList) {
        System.out.println(c);
    }


}