package org.example;

import java.util.*;

import static org.junit.Assert.assertEquals;

public class Priorities {

    public static void main(String[] args) {

        List<Integer> list1 = List.of(1, 4, 8, 4);
        List<Integer> output = getPriorities(list1);
        List<Integer> expected = List.of(1, 2, 3, 2);
        assertEquals(expected, output);

        List<Integer> list3 = List.of(1, 3, 7, 3);
        List<Integer> output3 = getPriorities(list3);
        List<Integer> expected3 = List.of(1, 2, 3, 2);
        assertEquals(expected3, output3);

    }


    private static List<Integer> getPriorities(List<Integer> priorities) {
        List<Integer> output = new ArrayList<>();
        Map<Integer, Integer> map = new HashMap<>();
        int counter = 1;
        for (Integer i : priorities) {
            if (!map.containsKey(i)) {
                map.put(i, counter++);//record the counter
                output.add(map.get(i));
            } else {
                output.add(map.get(i));
            }
        }
        return output;
    }
}
