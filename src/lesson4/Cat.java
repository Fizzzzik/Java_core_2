package lesson4;

public class Cat {
    //статический атрибут
    public static int count = 0;
    public static String status2 = "Домашний питомец ";
    //атрибут
    public String name;
    public String breed;


    //Конструктор экземпляра класса
    public Cat(String catName, String catBreed){
        this.name = catName;
        this.breed = catBreed;
        count++;
    }
    //Геттер
    public String getName() {
        return status2 + this.name;
    }
    //Сеттер
    public void setName(String newName) {
        this.name = newName;
    }
}
