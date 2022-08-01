package katatraining.kyu8;

import java.util.Arrays;

public class Kata002 {
    //Create a function with two arguments that will return an array of the first (n) multiples of (x).
    //Assume both the given number and the number of times to count will be positive numbers greater than 0.
    //Return the results as an array (or list in Python, Haskell or Elixir).

    //Examples:
    //countBy(1,10)  // should return  {1,2,3,4,5,6,7,8,9,10}
    //countBy(2,5)  // should return {2,4,6,8,10}

    //Решение 1
    public static void main(String[] args) {
        //countBy(1,10)
        int x = 1;
        int n = 10;

        int[] countBy = new int[n];
        int k = 0;
        int i = x;

        while (k < n) {
            countBy[k] = x;
            x = x + i;
            k++;
        }
        System.out.println(Arrays.toString(countBy));
    }
}

