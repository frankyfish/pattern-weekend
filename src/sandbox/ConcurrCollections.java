package sandbox;

import java.util.Arrays;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class ConcurrCollections {
    public static void main(String[] args) {

        CopyOnWriteArrayList<Integer> list
                = new CopyOnWriteArrayList<>(Arrays.asList(1, 2));
        new Thread(() -> {
            Iterator<Integer> iterator = list.iterator();
            while (iterator.hasNext()) {
                System.out.println(iterator.next().intValue());
            }
        }).start();
        System.out.println("Cleaning from main");
        list.clear();
        System.out.println("[main] collection size: " + list.size());
    }
}
