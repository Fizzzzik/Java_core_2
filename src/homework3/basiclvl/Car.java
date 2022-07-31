package homework3.basiclvl;

public abstract class Car {

    public final String model;

    public Car(String model) {
        this.model = model;
        System.out.println(model);
    }

    public static void startmoving() {
        System.out.println("Машина начинает движение");
    }
    public static void turnontheheadlights() {
        System.out.println("Машина включает фары");
    }
    public static void stopmoving() {
        System.out.println("Машина останавливается");
    }
    public static void feature() {
    System.out.println("Машина имеет особенности.\n");
    }
    //Getter
    public String getModel() {
        return this.model;
    }
}

