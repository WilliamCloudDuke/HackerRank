package org.example;

import java.util.*;

public class MiniMaxSum {

    public static void main(String[] args) {
        List<Integer> list = List.of(1,2,3,4,5);
        miniMaxSum(list);
    }

    public static void miniMaxSum(List<Integer> arr) {
        // Write your code here
        Map<Integer,    Long> map = new HashMap<>();
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < arr.size(); i++) {
            long sum=-arr.get(i);
            for(int j=0; j < arr.size(); j++) {
                map.put(i, sum+=arr.get(j));
            }
        }
        Optional<Long> min = map.values().stream().min(Comparator.comparingLong(i -> i));
        min.ifPresent(aLong -> sb.append(aLong).append(" "));

        Optional<Long> max = map.values().stream().max(Comparator.comparingLong(i -> i));
        max.ifPresent(aLong -> sb.append(aLong + " "));
        System.out.println(sb);
    }
}
