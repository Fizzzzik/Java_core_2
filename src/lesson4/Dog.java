package lesson4;

public class Dog {
    //статический атрибут
    public static int count = 0;
    public static String status1 = "Четвероногий друг ";
    //атрибут
    public String name;
    public String breed;

    //Конструктор экземпляра класса
    public Dog(String dogName, String dogBreed) {
        this.name = dogName;
        this.breed = dogBreed;
        count++;
    }
    //Геттер
    public String getName() {
        return status1 + this.name;
    }
    //Сеттер
    public void setName(String newName) {
        this.name = newName;
    }
}
