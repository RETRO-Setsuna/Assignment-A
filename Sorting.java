import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class SortingABC {
    static final Comparator<Chocolate> comparator = Comparator.comparing(Chocolate::getName)
            .thenComparing(Chocolate::getPrice);

    void sortChocolate(List<Chocolate> chocolates) {
        Collections.sort(chocolates, comparator);

        for (Chocolate c : chocolates) {
            System.out.println(c);
            System.out.println();
        }
    }

    @Override
    public String toString() {
        return "Sorting method: Alphabetical order";
    }
}

class SortingPrice {
    static final Comparator<Chocolate> comparator = Comparator.comparing(Chocolate::getPrice)
            .thenComparing(Chocolate::getType);

    void sortChocolate(List<Chocolate> chocolates) {
        Collections.sort(chocolates, comparator);

        for (Chocolate c : chocolates) {
            System.out.println(c);
            System.out.println();
        }
    }

    @Override
    public String toString() {
        return "Sorting method: Price order";
    }
}