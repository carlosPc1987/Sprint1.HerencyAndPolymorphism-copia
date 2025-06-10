package level1.exercise2.model;


public class Car {

    public static final String TradeMark = "Seat";
    private static String modelo;
    private final int power;

    public Car(int power) {
        this.power = power;
    }


    public static void setModelo(String modelo) {
        Car.modelo = modelo;
    }

    public static void breaking() {
        System.out.println(" Your Car is breaking.");
    }

    public void accelerate() {
        System.out.println("Your car is accelerating...\n");
    }

    public String toString() {
        return "Car: \n_" + TradeMark + " \n_TradeMark: " + modelo + "\n_P: " + power + " Horses of power";
    }
}

