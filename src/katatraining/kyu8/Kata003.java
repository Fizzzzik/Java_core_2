package katatraining.kyu8;
//https://www.codewars.com/kata/576bb71bbbcf0951d5000044/train/java
//Given an array of integers.
//Return an array, where the first element is the count of positives numbers and the second element is sum of negative
// numbers. 0 is neither positive nor negative.
//If the input is an empty array or is null, return an empty array.
//Example
// For input [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, -11, -12, -13, -14, -15], you should return [10, -65].

public class Kata003 {
    public static void main(String[] args) {

        int[] numbers = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, -11, -12, -13, -14, -15};
        int sumNegatives = 0;
        int count = 0;

        if( numbers.length == 0){
            System.out.println("Пустой массив");
        }else {


            for (int i = 0; i < numbers.length; i++) {
                if (numbers[i] > 0) {
                    count++;
                } else {
                    sumNegatives = sumNegatives + numbers[i];
                }
            }
        }
        System.out.println(count + ", " + sumNegatives);
    }
}
