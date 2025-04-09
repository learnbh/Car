package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Um zwischen Auto oder Fahrrad zu wählen drücke: \n 1 für Auto \n 2 für Fahrrad");
        String vehicle = scanner.nextLine();
        System.out.println("Anhalten = 0\n oder Geschwindigkeit erhöhen zahl>0 eingeben");
        int accelerate = scanner.nextInt();
        if (vehicle.equals("1")) {
            Car car = new Car("01", "Trabi");
            if(accelerate == 0)
                car.brake();
            else
                car.accelerate(accelerate);
        }
        else{
            Bicycle bicycle = new Bicycle("01", "Mountainbike");
            if(accelerate == 0)
                bicycle.brake();
            else
                bicycle.accelerate(accelerate);

        }

    }
}