package sandbox;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Threading {
    public static void main(String[] args) {
        ArrayList<Integer> objects = new ArrayList<>();
        objects.add(1);
        objects.add(2);

        List<Integer> syncIntegers = Collections.synchronizedList(objects);

        for (Integer integer: syncIntegers) {
            syncIntegers.remove(integer);
        }

        syncIntegers.forEach(e-> {
            System.out.println(getThreadInfo() + e); // todo wtf???
        });


//        new Thread(() -> {
//            Iterator<Integer> iterator = syncIntegers.iterator();
//            while (iterator.hasNext()) {
//                Integer syncInteger = iterator.next();
//                System.out.println(getThreadInfo() + syncInteger);
//                syncIntegers.remove(syncInteger);
//            }
//        }).start();

    }

    private static String getThreadInfo() {
        return "[" + Thread.currentThread().getName() + "]";
    }
}
