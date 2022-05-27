package org.example.collections.lists;

import java.util.ArrayList;
import java.util.List;

public class ListExample {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
//        List<String> names = new LinkedList<>();

        names.add("Arif");
        names.add("Ikhsan");

        names.set(0, "Udin");
        names.remove(1);
        System.out.println(names.get(0));
    }
}
