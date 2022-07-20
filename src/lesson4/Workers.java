package lesson4;

public class Workers {
    //статический атрибут
    public static int count = 0;
    //атрибут
    private String name;
    private int age;
    private int defective;

    //Конструктор экземпляра класса
    public Workers(String workerName, int workerAge, int workerDefective){
        this.name = workerName;
        this.age = workerAge;
        this.defective = workerDefective;
        count++;
    }


    //Метод экземпляра класса
    public void takeDefective() {
        this.defective = defective + 1;
        System.out.println(this.name + ": Ура! Я испортил водку!");
        //System.out.println(this.defective + ": всего");
    }
  //  public void sayHura() {
      //  System.out.println(this.name + ": Ура! Я испортил водку!");
        //this.defective = defective + 1;
       // System.out.println(this.defective + ": всего");
    //}

    //Геттеры
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public int getDefective() {
        return defective;
    }
    //Сеттеры
    public void setName(String name) {
        this.name = name;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public void setDefective(int defective) {
        this.defective = defective;
    }
}
