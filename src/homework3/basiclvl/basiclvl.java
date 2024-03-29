package homework3.basiclvl;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Path;

public class basiclvl {
    public static void main(String[] args) throws IOException, URISyntaxException {
        //Базовый уровень
        //Задача №1
        //Дано: у нас есть две модели машин - жигули и toyota. Каждая из этих машин умеет: начинать движение,
        //останавливаться, включать фары. У жигули есть особенность: она ломается. У Toyota особенность: включает музыку
        //Необходимо:
        // 1.Создать абстрактный класс, который будет описывать общие действия этих машин (методы будут не абстрактные)
        // 2.Создать два класса, которые будут наследоваться от абстрактного класса, и реализовывать особенности этих машин
        // Методы должны просто печатать на экран действия машин (начал движение, включил музыку и тд.)
        // 3. Создать два экземпляра этих классов, и вызвать методы характерные для них


        Zhiguli zhiguli = new Zhiguli("ВАЗ-2107");
        Zhiguli.startmoving();
        Zhiguli.stopmoving();
        Car.turnontheheadlights();
        Zhiguli.feature();


        Toyota toyota = new Toyota("Camry KHANN");
        Toyota.startmoving();
        Toyota.stopmoving();
        Toyota.turnontheheadlights();
        Toyota.feature();





        //Задача №2
        //Необходимо:
        // 1. Создать файл "my_first_file.txt". На первой строке написать: "Моя бабушка", на второй: "читает газету жизнь"
        // 2. Прочитать файл, и вывести на экран все слова файла в одну строку
        // Ожидаемый результат: "Моя бабушка читает газету жизнь"


        String filename = "C:\\repos\\java_core_2\\Java_core_2\\src\\homework3\\basiclvl\\my_first_file.txt";

        String string1 = "\n";
        //Запись в файл (перезапишет с нуля существующий или создаст новый)
        FileWriter fileWriter = new FileWriter(filename);
        fileWriter.write("Моя бабушка " + string1 + "читает газету жизнь");
        fileWriter.close();

        FileReader fileReader = new FileReader(filename);

        //Класс обертка, позволяющий читать кусками
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        while (bufferedReader.ready()) {
            String line = bufferedReader.readLine();
            System.out.print(line);

        }
        bufferedReader.close();




    //Задача №3
    //Необходимо:
    // 1. Создать класс Financial record, с двумя атрибутами: incomes, outcomes (доходы, расходы)
    // 2. Создать в этом классе геттеры, сеттеры и конструктор на все атрибуты
    // 3. Создать объект этого класса прямо здесь (class Homework3, метод main), с доходами 500, расходами 300
    // 4. Записать в файл "report.txt" данные из объекта класса.
    // Ожидаемый результат: в файле report.txt - одна строка: доходы = 500, расходы = 300

    Financialrecord date = new Financialrecord(500,300);
    String filename2 = "C:\\repos\\java_core_2\\Java_core_2\\src\\homework3\\basiclvl\\report.txt";

    //setter
    //date.setIncomes(900);
    //System.out.println(date.getIncomes());

    //Запись в файл (перезапишет с нуля существующий или создаст новый)
    FileWriter fileWriterText = new FileWriter(filename2);
    fileWriterText.write(date.getIncomes());
    fileWriterText.write(",  ");
    fileWriterText.write(date.getOutcomes());

    fileWriterText.close();
    }
}
        //Продвинутый уровень
        //Задача №1
        // Сделать задачу №1 (1 и 2 пункты) из базовой.
        // 1. Создать класс CarFactory, у которого есть два статических метода: создать жигули, создать toyota.
        // 2. Создать 20 тойот, 20 жигулей с помощью CarFactory, положить их в один массив.
        // 3. Пройтись по массиву, проверить к какому классу принадлежит машина, привести тип к классу машины
        // и вызвать характерные для нее методы.

//        Random random = new Random(1);
//        random.nextInt(10000);
        //Задача №2
        // 1. Создать класс Financial record, с двумя атрибутами: incomes, outcomes (доходы, расходы)
        // 2. Создать в этом классе геттеры, сеттеры и конструктор на все атрибуты
        // 3. Создать 10 отчетов, с разными доходами и расходами (используй random)
        // 4. Записать в файл "report.txt" все данные из отчетов.
        // 5. Прочитать файл report.txt, просуммировать все доходы и вывести на экран, тоже самое с расходами
        // Ожидаемый результат: общие доходы - (какое то число), общие расходы - (какое то число)

        //Экспертный уровень
        // Дано: папка, внутри которой находятся файлы, следующего именования - report_01_2012.txt, где 01 - месяц, 2012 - год
        // Внутри файла следующий формат:
        // pyterochka;122300.20;100312.10;20/01/2012
        // pyterochka;299922.00;323333.02;21/01/2012
        // perekrestok;9920.20;28200.01;21/01/2012
        // Где pyterochka - название магазина; 122300.20 - доход; 100312.10 - расход, 20/01/2012 - дата операции

        //Читать файлы нужно через
        //Прочитать все файлы из папки
        //String path1 = "путь до файла";
        //Files.walk(Path.of(path1)).forEach(e -> System.out.println(e.toString()));


        // Задача №1
        // Необходимо составить отчет о итоговой прибыли за каждый месяц по магазину pyterochka
        // Формат ожидаемого результат:
        // Прибыль по магазину pyterochka по месяцам
        // 01.2012: 20000.00
        // 02.2012: -100332.00
        // и тд


        // Задача №2
        // Необходим составить отчет о расходах за весь период по магазинам (т.е. прочитать все файлы внутри папки)
        // Формат ожидаемого результата:
        // Расходы pyterochka за весь период: 20032220.00
        // Расходы perekrestok за весь период: 1734220.00
        // .. и тд

