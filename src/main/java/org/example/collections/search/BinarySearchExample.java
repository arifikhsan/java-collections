package org.example.collections.search;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BinarySearchExample {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>(1000);

        for (int i = 1; i <= 1000; i++) {
            numbers.add(i);
        }

        // mencari bilangan menggunakan binary search
        int index = Collections.binarySearch(numbers, 500);
        System.out.println(index);
    }
}
