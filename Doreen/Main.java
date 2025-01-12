package com.doreen;

public class Main{
    public static void main(String[] args){

        System.out.println("Hello! Welcome to our Java application. This is a fun project. Let's get started!");

        Car car = new Car("SedanX", "Toyota Camry", 50, true);
        Motorcycle motorcycle = new Motorcycle("ThunderBike", "Yamaha YZF-R3", 35, 2);
        Truck truck = new Truck("HaulerPro", "Ford F-150", 90, 10);

        // Create an instance of the rental agency and a customer
        RentalAgency agency = new RentalAgency();
        Customer customer = new Customer("Mrs. Doreen");

        // Register the vehicles with the rental agency
        agency.addVehicle(car);
        agency.addVehicle(motorcycle);
        agency.addVehicle(truck);

        // Process the rental of a vehicle
        agency.rentVehicle("SedanX", customer, 5);

        // Handle the return of the rented vehicle  
        agency.returnVehicle("SedanX");



    }
}