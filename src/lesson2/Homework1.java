package lesson2;

import java.util.Arrays;

/**
 * Домашка №1
 */
public class Homework1 {
    public static void main(String[] args) {
        //Базовый уровень
        //Задача №1
        //Дано (переменные ниже менять нельзя)
        String hi = "                Hello ";
        String world = " WoRld!";
        char newLine = '\n';
        //Создать из трех переменных единую строку,
        //Привести к правильному виду (Ниже) используя String.trim()
        //затроить (Можно вызвать тольку одну команду System.out.println())
        //
        //Результат вывода на экран:
        //Hello world!
        //Hello world!
        //Hello world!

        //Решение
        String var1= hi.trim();
        String var2 = world.toLowerCase();

        System.out.println(var1 + var2 + newLine + var1 + var2 + newLine + var1 + var2 + newLine);


        //Задача №2
        //Создать переменные с ростом (!в метрах), весом в кило.
        //Произвести расчет индекса массы тела (вес) / (рост * рост) используя переменные, вывести на экран
        //Пример результата вывода на экран:
        //21.0345645

        //Решение
        double height = 1.75;
        double weight = 80.1;
        double index = weight / (height * height);

        System.out.println(index);


        //Задача №3
        //Создать из массива букв a,b,c,d,e, строку,вывести на экран , поменять в массиве 4 букву по счету на h,
        //и снова создать строку, вывести на экран
        //Ожидаемый результат:
        //abcde
        //abche

        //Решение
        char[] letters1 = new char[]{'a', 'b', 'c', 'd', 'e'};
        String charText1 = String.valueOf(letters1);

        System.out.println(charText1);

        letters1[3] = 'h';
        String charText2 = String.valueOf(letters1);

        System.out.println(charText2);



        //Продвинутый уровень
        //Задача №1
        //Произвести преобразование текста "234" в число типа int и прибавить к этому числу длину строки "some_text"

        //Решение
        String str1 = "234";
        int i = Integer.parseInt(str1.trim());
        //System.out.println("int i = " + i);
        String str2 = "some_text";
        int len = str2.length();
        //System.out.println("Длина строки = " + len);
        int sum = i + len;

        System.out.println("Результат преобразования текста и длины= " + (sum));

        //Задача №2
        //Посчитать (a+b)^2 = ?, при a=3, b=5

        //Решение
        int a = 3;
        int b = 5;
        int summa = a + b;
        System.out.println(summa * summa);

        //Задача №3
        //Создать два массив чисел:
        // 1,2,5,7,10
        // 2,3,2,17,15
        // Создать массив чисел, в котором будут: все числа из этих двух массивов,
        // и результат умножения чисел с одинаковым порядковым номером
        //
        //Ожидаемый результат:
        //1,2,5,7,10,2,3,2,17,15,2,6,10,119,150
        //(первый массив - 1,2,5,7,10), (второй массив - 2,3,2,17,15),
        //(результат перемножения - (1*2), (2*3), (5*2), (7*17), (10*15)

        //Решение
        int[] numbers1 = new int[]{1,2,5,7,10};
        int[] numbers2 = new int[]{2,3,2,17,15};
        int[] massive = new int[]{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
        massive[0] = numbers1[0];
        massive[1] = numbers1[1];
        massive[2] = numbers1[2];
        massive[3] = numbers1[3];
        massive[4] = numbers1[4];
        massive[5] = numbers2[0];
        massive[6] = numbers2[1];
        massive[7] = numbers2[2];
        massive[8] = numbers2[3];
        massive[9] = numbers2[4];
        massive[10] = numbers1[0] * numbers2[0];
        massive[11] = numbers1[1] * numbers2[1];
        massive[12] = numbers1[2] * numbers2[2];
        massive[13] = numbers1[3] * numbers2[3];
        massive[14] = numbers1[4] * numbers2[4];

        System.out.println(Arrays.toString(massive));


        //Задача №4
        //В слове "Hello world!" заменить l на r, сделать все буквы заглавными, выбрать первые 8 символов, вывести на экра
        // System.out.println(dst); // world

        //Решение
        String hello = "Hello world!";
        String helloChange = hello.replaceAll("l", "r");
        String helloUpper = hello.toUpperCase();
        String helloRazor = hello.substring(0, 8);
        int start = 6;
        int end = 11;
        char[] dst=new char[end - start];
        hello.getChars(start, end, dst, 0);

        //System.out.println(helloChange);
        //System.out.println(helloUpper);
        //System.out.println(helloRazor);
        System.out.println(dst);

        //Экспертный уровень
        //Задача №1
        //Создать метод маскирования персональных данных, который:
        //Телефон (до/после маскирования): 79991113344 / 7999***3344
        //Email (до/после маскирования): test@yandex.ru / tes*@******.ru, my_mail@gmail.com / my_mai*@*****.com
        //Фио (до/после маскирования): Иванов Иван Иванович / И****в Иван И.
        //
        //Входящие параметры: String text
        //Возвращаемый результат: String
        //
        //Примеры возможного текста:
        //Входящий стринг <client>(Какие то данные)<data>79991113344;test@yandex.ru;Иванов Иван Иванович</data></client>
        //Вернет - "<client>(Какие то данные)<data>7999***3344;tes*@******.ru;И****в Иван И.</data></client>"
        //<client>(Какие то данные)<data></data></client> - вернет тоже (никаких ошибок)
        //Входящий - <client>(Какие то данные)<data>Иванов Иван Иванович;79991113344</data></client>
        //Вернет - "<client>(Какие то данные)<data>И****в Иван И.;7999***3344</data></client>"

        //Используемые технологии: String.find, String.replaceAll, String.split, String.join, String.contains, String.substring
        //Регулярные выражения, класс StringBuilder
    }
}