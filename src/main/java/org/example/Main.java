package org.example;

import java.io.Console;
import java.util.ArrayList;
import java.util.List;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        List<Integer> valuesArr = new ArrayList<>();

        String word = "azbcaaa";
        int value = 0;
        for (int i = 0; i < word.length(); i++) {
            char letter = word.charAt(i);
            value = (int) letter - 96;
            if(letter == '_'){
                value = 0;
            }
            //System.out.println(value);
            valuesArr.add(value);
        } // here I convert the characters into numbers

        List<Integer> encodedArr = new ArrayList<>();
        int currentIndex = 0;

        while (currentIndex < valuesArr.size()) {
            int num = valuesArr.get(currentIndex);

            int sum = 0;

            for (int i = currentIndex + 1; i <= currentIndex + num; i++) {
                if (i < valuesArr.size()) {
                    sum += valuesArr.get(i);
                }
            }

            encodedArr.add(sum);
            currentIndex += (num + 1);
        }

        System.err.println("Encoded Chars to numbers : " + encodedArr);

    }
}
