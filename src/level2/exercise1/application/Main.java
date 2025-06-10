package level2.exercise1.application;

import level2.exercise1.mode.Smartphone;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Smartphone smartphone = new Smartphone("Samsung", "SXA33-9204");

        System.out.println("Starting your Smartphone...\n");

        System.out.println("Dial the phone number:");
        String number = sc.nextLine();
        smartphone.call(number);

        System.out.println("Opening the Camera...");
        smartphone.takePic();
        System.out.println("Alarm:");
        smartphone.alarm();

    }
}

