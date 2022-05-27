package org.example.iterables;

import java.util.Iterator;
import java.util.List;


// iterable adalah super collection yang bukan map

public class IterableExample {
    public static void main(String[] args) {
        Iterable<String> names = List.of("Arif", "Ikhsan", "Udin");
        for (String name : names) {
            System.out.println(name);
        }

        System.out.println("Iterator:");
        Iterator<String> iterator = names.iterator();

        //noinspection WhileLoopReplaceableByForEach
        while(iterator.hasNext()) {
            var name = iterator.next();
            System.out.println(name);
        }
    }
}
