package org.example.collections.sets;

import java.util.EnumSet;

public class EnumSetExample {
    public enum Gender {
        MALE, FEMALE, NOT_MENTION
    }

    public static void main(String[] args) {
        EnumSet<Gender> genders = EnumSet.allOf(Gender.class);
//        EnumSet<Gender> genders = EnumSet.of(Gender.MALE, Gender.FEMALE);
//        var genders = Gender.values();

        for (Gender gender : genders) {
            System.out.println(gender);
        }
    }
}
