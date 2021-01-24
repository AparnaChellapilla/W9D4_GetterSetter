package com.tts;

import com.tts.vehicle.Car;
import com.tts.vehicle.SlideCar;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Car sportsCar = new Car();
            sportsCar.color = "Blue";
            sportsCar.numWheels = 4;
            sportsCar.numberOfDoors = 2;
            sportsCar.start();
            sportsCar.drive();
            sportsCar.stop();
        System.out.println(sportsCar);

        Car fam = new Car("White", 4);
        fam.setCarType(Car.TYPE_FAMILY);
        System.out.println(fam);

    }
}
