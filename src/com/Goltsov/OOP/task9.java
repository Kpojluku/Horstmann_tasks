package com.Goltsov.OOP;
/*
Implement a class Car that models a car traveling along the x-axis, consuming gas as it moves.
Provide methods to drive by a given number of miles,
to add a given number of gallons to the gas tank, and to get the
current distance from the origin and fuel level. Specify the fuel efficiency
(in miles/gallons) in the constructor. Should this be an immutable class?
Why or why not?
 */
public class task9 {
    public static void main(String[] args) {
        Car car = new Car(10);
        car.fillTank(5);
        try {
            car.drive(51);
        }catch (Exception e){
            car.fillTank(5);
        }
        System.out.println(car.getFuelTankVolume());
        System.out.println(car.getX());
        try {
            car.drive(25);
        }catch (Exception e){
            car.fillTank(5);
        }
        System.out.println(car.getFuelTankVolume());
        System.out.println(car.getX());
    }
    static class Car{
        private double fuelEfficiency;
        private double fuelTankVolume;
        private double x;

        public Car(double fuelEfficiency) {
            this.fuelEfficiency = fuelEfficiency;
        }

        public void drive(double miles) throws Exception {
            if(fuelTankVolume - (miles / fuelEfficiency) < 0){
                throw new Exception("Чтобы проехать заданное количество миль, заправьте топливный бак");
            }
            x += miles;
            fuelTankVolume -= (miles / fuelEfficiency);
        }
        public void fillTank(double gallons){
            fuelTankVolume+=gallons;
        }

        public double getFuelTankVolume() {
            return fuelTankVolume;
        }

        public double getX() {
            return x;
        }
    }
}
