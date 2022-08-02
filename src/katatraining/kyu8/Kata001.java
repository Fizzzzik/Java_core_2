package katatraining.kyu8;

public class Kata001 {
    //We need a function that can transform a number (integer) into a string.

    //What ways of achieving this do you know?

    //Examples (input --> output):
    //123  --> "123"
    //999  --> "999"
    //-100 --> "-100"

    //Решение
    public static void main(String[] args) {
        //public static String numberToString(int num) {
        int num = -100;

        String numberToString1 = "\"" + num + "\"";
        String numberToString = numberToString1.trim();
        System.out.println(numberToString);
        System.out.println(numberToString1);



    }
}




