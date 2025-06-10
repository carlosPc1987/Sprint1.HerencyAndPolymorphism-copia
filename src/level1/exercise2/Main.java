package level1.exercise2;

import level1.exercise2.model.Car;

import static level1.exercise2.model.Car.TradeMark;

public class Main {
    public static void main(String[] args) {

        System.out.println("\n -------Loading Program of Cars " + TradeMark + " ...\n");

        Car car1 = new Car(1200);
        Car car2 = new Car(800);
        Car.setModelo("One");

        System.out.println("Showing Production of Cars_1:");
        Car.breaking();

        System.out.println(car1.toString());
        car1.accelerate();

        System.out.println("Showing Production of Cars_2:");
        Car.breaking();

        System.out.println(car2.toString());
        car2.accelerate();
    }
}
