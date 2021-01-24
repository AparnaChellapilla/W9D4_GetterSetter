package com.tts.vehicle;

public class Car {
    public String color = "Blue";
    public int numWheels;
    public int numberOfDoors;

    public Car() {

    }

    public void Car(String color,int numberOfDoors) {
        this.color = "White";
        this.numberOfDoors = 2;
    }
    public void Car(String color,int numWheels,int numberOfDoors){
     this.color = "Blue";
     this.numWheels = 4;
     this.numberOfDoors =2;

    }

    //set and get methods
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getNumWheels() {
        return numWheels;
    }

//    public void setNumWheels(int numWheels) {
//        this.numWheels = numWheels;
//    }

    public int getNumberOfDoors() {
        return numberOfDoors;
    }

//    public void setNumberOfDoors(int numberOfDoors) {
//        this.numberOfDoors = numberOfDoors;
//    }

    public void start(){
        System.out.println("Car Starting");
    }

    public void stop(){
        System.out.println("Car Stopping, hit the brakes");
    }

    public void drive(){
        System.out.println("Car moving");
    }
    public void drive(int miles) {
        System.out.println("Driving for " + miles + "miles");
    }
    public void drive(int miles,int speed){
        System.out.println("Driving" + speed + "mph for" + miles + "miles.");
    }
    public void drive(String destination){
        System.out.println("Driving to" + destination);
    }



    // private (internal) constants
    private static final int MAX_DOORS = 6;
    private static final int MIN_DOORS = 1;

    // public (external) constants
    public static final String TYPE_SPORTY = "Sporty";
    public static final String TYPE_FAMILY = "Family";

    // a new property and its respective accessors
    private String carType;

    public Car(String color, int numberOfDoors){
        this.color = color;
        this.numberOfDoors = numberOfDoors;
    }

    public String getCarType()
    {
        return carType;
    }
    public void setCarType(String carType)
    {
        this.carType = carType;
    }
    // rest of class the same with the exception of setNumberOfDoors
    public void setNumberOfDoors(int numberOfDoors)
    {
        if ( MIN_DOORS >= 1 && numberOfDoors <= MAX_DOORS)
            this.numberOfDoors = numberOfDoors;
        else
            this.numberOfDoors = -1;
    }

    @Override
    public String toString() {
        return "Car{" +
                "color='" + color + '\'' +
                ", numWheels=" + numWheels +
                ", numberOfDoors=" + numberOfDoors +
                ", carType='" + carType + '\'' +
                '}';
    }
}

