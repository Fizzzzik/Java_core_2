package lesson1;

public class lesson1 {
    public static void main(String[] args) {
        System.out.println("hello world!");

        //Примитивы
        //Нравится ли вам кофе
        // true - да, false - нет
        boolean answer = true;
        System.out.println("Нравится ли вам кофе?");
        System.out.println(answer);


        //от -128 до +127
        byte bt = -128;

        //от -32765 до +32765
        short st = 32767;

        //от от -2 147 483 648 до 2 147 483 647
        int number = -2_000_000_000;

        //диапазон до 2 в 64 степени
        long ln = 8_000_000_000L;

        //числа с плавающей точкой
        float fl = 3.4657f;
        System.out.println(fl);


        double db = 3.465757783993949959888888;
        System.out.println(db);

        double db2 = 1_000_000_000_000.465757783993949959888888;
        System.out.println(db2);


        double number1 = 10;
        int number2 = 2;
        double result2 = number1 / number2;
        double result3 = number1 - number2;
        double result4 = number1 + number2;
        double result5 = number1 * number2;
        System.out.println(result2);
        System.out.println(result3);
        System.out.println(result4);
        System.out.println(result5);

        //Символы
        char ch = 123 + 1;
        System.out.println(ch);

        int[] array = new int[5];
        array[0] = 10;
        System.out.println(array[0]);

        //Разная реализация типов Данных. тип 1
        char[] arrayChar = new char[5];
        arrayChar[0] = 'v';
        arrayChar[1] = 'o';
        arrayChar[2] = 'd';
        arrayChar[3] = 'k';
        arrayChar[4] = 'a';
        System.out.println(arrayChar);

        char[] arrayChapaev = new char[12];
        arrayChapaev[0] = ' ';
        arrayChapaev[1] = 'д';
        arrayChapaev[2] = 'л';
        arrayChapaev[3] = 'я';
        System.out.println(arrayChapaev);



        //Разная реализация типов Данных. тип 2
        String vodka = "водка";
        System.out.println(vodka);

        String forChapaev = " для Чапаева";

        //Конкатенация
        String resultchapaev = vodka + forChapaev;
        System.out.println(resultchapaev);

        System.out.println("Информация: " + true);

    }
}
