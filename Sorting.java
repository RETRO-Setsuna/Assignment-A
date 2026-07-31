import java.util.Collections;
import java.util.Comparator;
import java.util.List;

interface ChocolateSorter {

    Comparator<Chocolate> getComparator();

    default void sortChocolate(List<Chocolate> chocolates) {
        Collections.sort(chocolates, getComparator());

        for (Chocolate c : chocolates) {
            System.out.println(c);
            System.out.println();
        }
    }
}

class SortingByAlphabet implements ChocolateSorter {
    static final Comparator<Chocolate> comparator = Comparator.comparing(Chocolate::getName)
            .thenComparing(Chocolate::getPrice);

    @Override
    public Comparator<Chocolate> getComparator() {
        return comparator;
    }

    @Override
    public String toString() {
        return "Sorting method: Alphabetical order";
    }
}

class SortingByPrice implements ChocolateSorter {
    static final Comparator<Chocolate> comparator = Comparator.comparing(Chocolate::getPrice)
            .thenComparing(Chocolate::getType);

    @Override
    public Comparator<Chocolate> getComparator() {
        return comparator;
    }

    @Override
    public String toString() {
        return "Sorting method: Price order";
    }
}
