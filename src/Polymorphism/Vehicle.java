package Polymorphism;

public class Vehicle {
    void start(){
        System.out.println(" Vehicle Started ");
    }
}
class Car extends Vehicle {
    void start(){
        System.out.println(" Car Started ");
    }
}
class Motorcycle extends Vehicle {
    void start(){
        System.out.println(" Motorcycle Started ");
    }
}
class Garage {
    void serviceVehicle(Vehicle vehicle){
        vehicle.start();
        System.out.println(" Vehicle serviced ");
    }
}
class Main {
    public static void main(String[] args) {
        Car car = new Car();
        Motorcycle motorcycle = new Motorcycle();
        Garage garage = new Garage();
        garage.serviceVehicle(car);
        garage.serviceVehicle(motorcycle);

    }
}
