package lesson4;

public class Warehouse {
    //статический атрибут
    public static int count = 0;
    //атрибут
    private String position;
    private int quantity;

    //Конструктор экземпляра класса
    public Warehouse(String positionName, int quantityPieces){
        this.position = positionName;
        this.quantity = quantityPieces;
        count++;
    }


    //Метод экземпляра класса
    public void takePosition() {
        this.quantity = quantity - 1;
        //System.out.println("Осталось товара: " + position + " " + quantity + " штук");

    }


    //Геттеры
    public String getPosition() {
        return position;
    }
    public int getQuantityPieces() {
        return quantity;
    }
    //Сеттеры
    public void setPosition(int vodka) {
        this.position = position;
    }
    public void setQuantityPieces(int newQuantity) {
        this.quantity = newQuantity;
    }

}
