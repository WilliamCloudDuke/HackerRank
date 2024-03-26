package org.example;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class BreakingRecords {




    public static void main(String[] args) {
        List<Integer> input = List.of(10,5,20,20,4,5,2,25,1);
        List<Integer> output = breakingRecords(input);
        List<Integer> expected = List.of(2,4);
        assertEquals(expected, output);

        List<Integer> input1 = List.of(3,4,21,36,10,28,35,5,24,42);
        List<Integer> output1 = breakingRecords(input1);
        List<Integer> expected1 = List.of(4,0);
        assertEquals(expected1, output1);

        List<Integer> input2 = List.of(100,45,41,60,14,41,45,43,100,40,89,92,34,6,64,7,37,81,32,50);
        List<Integer> output2 = breakingRecords(input2);
        List<Integer> expected2 = List.of(0,4);
        assertEquals(expected2, output2);

    }

    public static List<Integer> breakingRecords(List<Integer> scores) {
        List<Integer> records = new ArrayList<>();
        //variables to determine values
        int highestScore=0, highestScoreCount=0;
        int lowestScore=0, lowestScoreCount=0;
        //Traverse the array of scores
        for(int i =0 ; i<scores.size()-1 ; i++ ) {
            //calculate Highest & Lowest score
            if(i==0) {
                if(scores.get(i) > scores.get(i + 1)) {
                    highestScore = scores.get(i);
                    //calculate Lowest score
                    lowestScore = scores.get(i + 1);
                    lowestScoreCount+=1;
                } else {
                    if(scores.get(i + 1) > scores.get(i)) {
                        highestScore = scores.get(i + 1);
                        highestScoreCount+=1;
                        //calculate Lowest score
                        lowestScore = scores.get(i);

                    } else { //they are equal
                        highestScore = scores.get(i);
                        //calculate Lowest score
                        lowestScore = scores.get(i);
                    }
                }
            }
            //Calculate Highest
            if(scores.get(i + 1) > scores.get(i) && scores.get(i + 1) > highestScore) {
                highestScore = scores.get(i + 1);
                highestScoreCount+=1;
            }
            //Calculate Lowest
            if(scores.get(i + 1) < scores.get(i) && scores.get(i + 1) < lowestScore) {
                lowestScore = scores.get(i + 1);
                lowestScoreCount+=1;
            }
        }
        records.add(highestScoreCount);
        records.add(lowestScoreCount);
        return records;
    }
}
