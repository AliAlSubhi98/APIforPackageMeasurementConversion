package org.example;

import java.util.ArrayList;
import java.util.List;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        List<Integer> outputs = new ArrayList<>();

        String word = "abbcc";
        int value = 0;
        for (int i = 0; i < word.length(); i++) {
            char letter = word.charAt(i);
            value = (int) letter - 96;

            System.out.println(value);
            outputs.add(value);

        }

        System.err.println(outputs);

    }
}
