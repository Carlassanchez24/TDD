package org.example;

import java.util.ArrayList;
import java.util.List;

public class ListDivisible {
    public static List<Integer> divisibleList(List<Integer> list, int divisor) {
        List<Integer> result = new ArrayList<>();

        for (int number : list) {
            if (number % divisor == 0) {
                result.add(number);
            }
        }
        return result;
    }
}
