package org.example.collections.lists;

import java.util.ArrayList;
import java.util.List;

import static java.util.Collections.*;

public class ImmutableList {
    public static void main(String[] args) {
        System.out.println(emptyList()); // immutable list kosong
        System.out.println(singletonList("aaa")); // immutable list 1 element

        var names = new ArrayList<>();
        names.add("Arif");
        names.add("Ikhsan");
        names.add("Udin");

        //noinspection Java9CollectionFactory
        System.out.println(unmodifiableList(names)); // mutable to immutable

        var immutableNames = List.of("Arif", "Ikhsan", "Udin");
        System.out.println(immutableNames);  // immutabe list
    }
}
