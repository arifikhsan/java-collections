package org.example.collections.sets;

import java.util.LinkedHashSet;
import java.util.Set;

public class HashSetExample {
    @SuppressWarnings("OverwrittenKey")
    public static void main(String[] args) {
//        Set<String> names = new HashSet<>(); // tidak pasti urut
        Set<String> names = new LinkedHashSet<>(); // berurut
        names.add("Arif");
        names.add("Ikhsan");
        names.add("Udin");

        names.add("Arif");
        names.add("Ikhsan");
        names.add("Udin");

        for (String name : names) {
            System.out.println(name);
        }
    }
}
