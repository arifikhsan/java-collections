package org.example.collections.sets;

import java.util.HashSet;
import java.util.Set;

import static java.util.Collections.*;

@SuppressWarnings({"Java9CollectionFactory", "ConstantConditions"})
public class ImmutableSetExample {
    public static void main(String[] args) {
        Set<String> empty = emptySet();
        Set<String> one = singleton("aaa");

        Set<String> mutable = new HashSet<>();
        mutable.add("Arif");
        mutable.add("Ikhsan");
        Set<String> immutableNames = unmodifiableSet(mutable);
        Set<String> immutableNames2 = Set.of("Arif", "Ikhsan", "Udin");

        immutableNames.add("aaa"); // gabisa
        immutableNames.remove("aaa"); // gabisa juga
    }
}
