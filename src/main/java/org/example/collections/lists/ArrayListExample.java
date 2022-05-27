package org.example.collections.lists;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class ArrayListExample {
    public static void main(String[] args) {
        Collection<String> names = new ArrayList<>();
        names.add("Arif");
        names.add("Ikhsan");
        names.add("Udin");
        names.addAll(List.of("Arif", "Ikhsan", "Udin"));

        for (String name : names) {
            System.out.println(name);
        }

        System.out.println("remove...");

        names.remove("Arif");
        names.removeAll(List.of("Ikhsan", "Udin"));

        for (String name : names) {
            System.out.println(name);
        }

        System.out.println(names.contains("Arif"));
        System.out.println(names.containsAll(List.of("Arif", "Ikhsan"))); // harus ada semua
        System.out.println(names.size());
    }
}
