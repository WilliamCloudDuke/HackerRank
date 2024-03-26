package org.example;

import java.util.Arrays;

public class Staircase {

    public static void main(String[] args) {
        String[][] matrix;
        matrix = new String [6][6];

        //staircase(6);
        int counter=0;
        for(int row=0; row <=5; row++){
            counter++;
            for(int col=5; col >=row; col--){
                System.out.print(" ");
            }
            for(int j=0; j<=counter-1; j++){
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }


    public static void staircase(int n) {
        // Write your code here
        if(n<=0) throw new IllegalArgumentException("n must be greater than Zero");

        int counter=0;
        for(int i=0; i<n; i++){
            counter++;
            for(int k=n; k>=i; k--){
                System.out.print(" ");
            }
            for(int j=0; j<=counter-1; j++){
                System.out.print("#");
            }
            System.out.print("\n");
        }
    }

}

