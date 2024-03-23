package org.example;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class GradingStudents {


    public static void main(String[] args) {
        List<Integer> input = List.of(73,67,38,33);
        List<Integer> output = gradingStudents(input);
        List<Integer> expected = List.of(75,67,40,33);
        assertEquals(expected, output);

        List<Integer> input1 = List.of(37,38);
        List<Integer> output1 = gradingStudents(input1);
        List<Integer> expected1 = List.of(37,40);
        assertEquals(expected1, output1);

        List<Integer> input2 = List.of(50,59,36,97,28,61,54,29);
        List<Integer> output2 = gradingStudents(input2);
        List<Integer> expected2 = List.of(50,60,36,97,28,61,55,29);
        assertEquals(expected2, output2);
    }


    public static List<Integer> gradingStudents(List<Integer> grades) {
        List<Integer> finalGrades = new ArrayList<>();
        for(Integer g: grades){
            finalGrades.add(getRounding(g));
        }
        System.out.println(finalGrades);
        return finalGrades;
    }

    private static Integer getRounding(Integer grade){
        if(grade == null || grade > 100) throw new IllegalArgumentException("grade must have a value");
        if(grade < 38) return grade;
        //calculateRounding
        //example 67
        int number = 0;
        for(int i=1; i < 3; i++){
            number = grade+i;
            if(number %5 ==0){
                break;
            } else {
                number = 0;
            }
        }
        return number !=0? number:grade;
    }

}
