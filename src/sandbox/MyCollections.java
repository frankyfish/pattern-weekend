package sandbox;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class MyCollections {
    public static void main(String[] args) {
        Set<NonComparable> set = new TreeSet<>();
        set.add(new NonComparable(2));
        set.add(new NonComparable(1));
        set.forEach(System.out::println);

        HashSet<NonComparable> objects = new HashSet<>();
        objects.add(new NonComparable(4));
        objects.add(new NonComparable(3));
        objects.stream()
               .sorted()
               .forEach(System.out::println);
    }
}
