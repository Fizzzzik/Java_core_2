package lesson4;

import java.util.Arrays;

public class HomeworkTasks {
    public static void main(String[] args) {

        // Домашка
        // Базовый уровень
        // Задание №1 - Написать цикл, который выводит через пробел 100 чисел с приставкой "a".
        // Ожидаемый результат: 1а 2а 3а .. 100а

        // Решение
        for (int i = 1; i <= 100; i++) {
            System.out.print(i + "a ");
        }
        // переход на другую строку, чтобы корректно отображались результаты по сл.задаче
        System.out.println('\n');



        // Задание №2
        // Дано:
        int ageChildren = 30;

        // Задача: Написать условную конструкцию, которая в зависимости от возраста ребенка, отправляет его в учебное заведение
        // если ребенку до 6 лет то в сад, если до 11 лет в младшую школу, если до 17 лет в среднюю школу, иначе в университет
        // Отправляет - имеется в виду, печатает на экран: "пошел с сад", "пошел в младшую школу" и т.д.
        // Проверьте работоспособность условий, через изменение значения переменной.

        //Решение


        if (ageChildren < 6) {
            System.out.println("пошел в сад");
        } else if (ageChildren < 11) {
            System.out.println("пошел в младшую школу");
        } else if (ageChildren < 17) {
            System.out.println("пошел в среднюю школу");
        } else {
            System.out.println("пошел в университет");
        }
        // переход на другую строку, чтобы корректно отображались результаты по сл.задаче
        System.out.println();


        // Задание №3
        // Дано:
        boolean chicken = false;
        boolean vegetables = true;
        boolean sour = true;
        boolean toast = true;
        boolean sausage = true;
        boolean eggs = true;
        // Задача: Повара попросили сделать салат.
        // Если у повара есть все ингредиенты для "Цезаря" (курица, овощи, соус и гренки), то лучше сделать "Цезарь".
        // Если для "Цезаря" ингредиентов не нашлось, то сделать Оливье (овощи, колбаса или курица, яйца).
        // Если и для Оливье не нашлось ингредиентов, то сделать Овощной салат (нужны только овощи).
        // Если ингредиентов нет, то повар объявляет: У меня ничего нет
        // Написать набор условий, приготовления салатов, по приоритету (от Цезаря к овощному). Либо объявить о невозможности сделать салат.
        // Ожидаемый результат: вывод на экран сделанного салата или объявление о том, что ничего нет.
        // Проверьте работоспособность условий, через изменение значения переменных.

        //Решение
        if (chicken && vegetables && sour && toast) {
            System.out.println("Салат Цезарь");
        } else if (vegetables && eggs && (sausage || chicken)) {
            System.out.println("Салат Оливье");
        } else if (vegetables) {
            System.out.println("Овощной салат");
        } else {
            System.out.println("Ничего нет");
        }
        // переход на другую строку, чтобы корректно отображались результаты по сл.задаче
        System.out.println();



        // Задание №4
        // Создать два класса, которые описывают какое либо животное (имеют два атрибута).
        // Написать к ним конструктор, сеттеры, геттеры.
        // Создать экземпляры этих двух животных.

        //Решение

        Dog palkan = new Dog("Palkan", "Bull Mastiff");
        Dog dork = new Dog("Dork", "Beagle");
        Cat vasya = new Cat("Vasya", "Maine coon");
        Cat rizhik = new Cat("Rizhik", "Sphynx");

        System.out.println(palkan.getName());
        System.out.println(dork.getName());
        System.out.println(vasya.getName());
        System.out.println(rizhik.getName());

        vasya.setName("Ventilyator");
        System.out.println(vasya.getName());

        // переход на другую строку, чтобы корректно отображались результаты по сл.задаче
        System.out.println();



        // Продвинутый уровень
        // Задание №1: Написать цикл, который будет прибавлять число к result до тех пор,
        // пока не получиться больше 1_000_000.
        // Дано:
        double increment = 20.6767;
        double result = 0;
        // Вывести на экран, количество итераций, которое потребовалось, чтобы дойти до миллиона.
        // Если число отрицательное, то сразу заканчиваем цикл, ничего не выводя.
        // Внимание: число может измениться, и не должно приводить к изменению вашего кода.

        // Решение
        System.out.println("\n" + "Задание №1");
        int i = 0;
        while (result < 1_000_000) {
            result = result + increment;
            i++;
            if (increment < 0) {
                break;
            } else if (result > 1_000_000){
                System.out.println("Количество итераций до миллиона = " + i);
            } else {
            }
        }
        // переход на другую строку, чтобы корректно отображались результаты по сл.задаче
        System.out.println();

        // Задание №2: Дан массив единиц, произвольной длины. Создать цикл, который заменяет каждый четный элемент на 0;
        // Например, дано: [1,1,1,1,1]
        // Ожидаемый результат: [0,1,0,1,0]
        // Подсказка: прочитай про операнд "%".

        // Решение
        System.out.println("\n" + "Задание №2");
        int[] ints1 = {1,1,1,1,1,1};
        int[] resultInts = new int[ints1.length];

        for (int k = 0; k < ints1.length; k++) {
            String strToPrint = "ints1[" + k + "]=" + ints1[k];
            resultInts[k] = k % 2;
        }
        System.out.println(Arrays.toString(resultInts));


            // Задание №3:
            // Дано:
            boolean hasFuel = true;
            boolean hasElectricsProblem = true;
            boolean hasMotorProblem = true;
            boolean hasTransmissionProblem = false;
            boolean hasWheelsProblem = false;
            // В автосервис приехала сломанная машина. Механики находят неисправность следующим способом:
            // Если у машины нет бензина и ничего не сломано, то отдают машину владельцу и берут 1000 рублей за консультацию.
            // Если у машины проблема с двигателем, то чинят и берут 10 000.
            // Если у машины проблема с электрикой, то чинят и берут 5000.
            // Если у машины проблема с коробкой передач, то чинят и берут 4000.
            // Если у машины проблема с колесами, то чинят и берут 2000.
            // Если две детали сломаны, то на общий счет идет скидка 10%.
            // Если сломана коробка передач, и электрика или двигатель, то на общий счет скидка 20%.
            // Если нет бензина и что-то сломано, то за консультацию денег не берут.
            // Ситуации, что бензин есть и ничего не сломано - быть не может.
            // Ожидаемый результат: выведен на экран счет клиенту.

        // Решение
        System.out.println("\n" + "Задание №3");

        int i1 = hasFuel ? 1 : 0;
        int i2 = hasElectricsProblem ? 1 : 0;
        int i3 = hasMotorProblem ? 1 : 0;
        int i4 = hasTransmissionProblem ? 1 : 0;
        int i5 = hasWheelsProblem ? 1 : 0;
        int x = (i2 + i3 + i4 + i5);
        boolean hasProblem2Details = true == ((i2 + i3 + i4 + i5) == 2);
       // System.out.println(x);

        if (!hasFuel && !hasElectricsProblem && !hasMotorProblem && !hasTransmissionProblem && !hasWheelsProblem) {
            int price1 = 1000;
            System.out.println("Залили бензин. Консультация, руб = " + price1);
        } else if (hasFuel && !hasElectricsProblem && hasMotorProblem && !hasTransmissionProblem && !hasWheelsProblem ) {
            int price2 = 10000;
            System.out.println("Починка двигателя, руб = " + price2);
        } else if (hasFuel && hasElectricsProblem && !hasMotorProblem && !hasTransmissionProblem && !hasWheelsProblem) {
            int price3 = 5000;
            System.out.println("Починка электрики, руб = " + price3);
        } else if (hasFuel && !hasElectricsProblem && !hasMotorProblem && hasTransmissionProblem && !hasWheelsProblem) {
            int price4 = 4000;
            System.out.println("Починка коробки, руб = " + price4);
        } else if (hasFuel && !hasElectricsProblem && !hasMotorProblem && !hasTransmissionProblem && hasWheelsProblem) {
            int price5 = 2000;
            System.out.println("Починка колес, руб = " + price5);
        } else if (hasFuel && (hasElectricsProblem || hasMotorProblem) && hasTransmissionProblem) {
            float totalprice2 = (i2 * 5000 + i3 * 10000 + i4 * 4000 + i5 * 2000) * 0.8f;
            System.out.println("Починка коробки и эл-ки или двигателя со скидкой 20%, руб = " + totalprice2);
        } else if (hasFuel && (hasProblem2Details)) {
            float totalprice1 = (i2 * 5000 + i3 * 10000 + i4 * 4000 + i5 * 2000) * 0.9f;
            System.out.println("Замена двух деталей со скидкой 10%, руб = " + totalprice1);
        } else if (!hasFuel && (hasElectricsProblem || hasMotorProblem || hasTransmissionProblem || hasWheelsProblem )) {
            float totalprice3 = i1 * 1000 + i2 * 5000 + i3 * 10000 + i4 * 4000 + i5 * 2000;
            System.out.println("Что-то сломано. Консультация = 0 руб. Всего, руб = " + totalprice3 );
        } else {
            System.out.println("Такой ситуации быть не может");
        }
        // Задание №4:
        // Написать систему управления складскими запасами. Создать класс склад, создать класс работники
        // (написать геттеры на все аттрибуты).
        // Количество работников минимум 3.
        // Работники берут из склада товар, и портят его. Нужно написать взаимодействие через методы работников и склад:
        // Работник берет из склада товар, на складе товар уменьшается. Работник когда взял товар, выводит на экран
        // "Ура я испортил водку!" и добавляет к себе в журнал количество испорченного товара.
        // У склада есть только одна позиция - Водка.

        // Решение
        System.out.println("\n" + "Задание №4");
        Warehouse vodka = new Warehouse("Vodka", 15);
        Workers petrovich = new Workers("Petrovich", 55, 0);
        Workers ivahich = new Workers("Ivanich", 60, 0);
        Workers kuzmich =new Workers("Kuzmich", 53, 0);

        System.out.println("Всего водки было на складе : " + vodka.getQuantityPieces() + " шт." );
        for (int w = vodka.getQuantityPieces(); w > 0; w--) {

            // Не догадался как рандомно заставить сотрудников брать водку
            if (w < 5) {
                petrovich.takeDefective();
            } else if (w >= 8) {
                ivahich.takeDefective();
            } else {
                kuzmich.takeDefective();
            }
            vodka.takePosition();
        }
        System.out.println("Сотрудник " + petrovich.getName() + " испортил водки " + petrovich.getDefective() + " шт." );
        System.out.println("Сотрудник " + ivahich.getName() + " испортил водки " + ivahich.getDefective() + " шт." );
        System.out.println("Сотрудник " + kuzmich.getName() + " испортил водки " + kuzmich.getDefective() + " шт." );



            // Экспертный уровень:
            // Предыстория: Мы находимся в статистическом институте. Хочется понять уровень миграции между регионами за месяц.
            // Для этого было решено произвести анализ передвижения автомобилей: на границе каждого региона стоят камеры,
            // фиксирующие въезд и выезд автомобилей. Формат автомобильного номера: (буква)(3 цифры)(2 буквы)(2-3 цифры)
            // К474СЕ178 - где 178 регион

            // Задача №1: узнать сколько всего машин со спец номерами: начинаются на M и заканчиваются на АВ.
            // Не повторяющиеся

            //Входящие данные
            // Map<Integer, Map<String, String[]>> - где ключ первого уровня - номер региона,
            // out, input - ключи второго уровня (выезд, въезд), и String[] - массивы номеров.
            // { 1 : {
            //      "out" : ["К474СЕ178"],
            //      "input": ["А222РТ178"]
            //    },
            //   2 : {
            //        "out" : ["К722АВ12", "А222РТ178"],
            //        "input" : ["М001АВ01", "А023РВ73"],
            //   }
            // ..
            //  }

            //Список технологий:
            // Set (HashSet) - узнать что это, set.contains(), set.put()
            // Map (HashMap) - узнать что это, map.get(), map.put(), map.entrySet() - для итерации, entry.getValue(), entry.getKey()
            // <Integer> - обозначает тип который хранится в этой структуре данных (Generics)
            // Регулярные выражения - вытащить регион авто
        }
    }