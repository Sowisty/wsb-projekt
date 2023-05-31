package models;

import interfaces.CarModel;

public class Car implements CarModel {
    public String brand;
    public String model;
    public int speed;

    public Car(String brand, String model) {
        this.brand = brand;
        this.model = model;
        this.speed = 0;
    }


    public void startCar() {
        System.out.println("Samochód " + brand + " " + model + " został uruchomiony.");
    }


    public void stopCar() {
        System.out.println("Samochód " + brand + " " + model + " został zatrzymany.");
    }


    public void accelerate(int speed) {
        this.speed += speed;
        System.out.println("Samochód " + brand + " " + model + " przyspieszył do " + this.speed + " km/h.");
    }


    public void decelerate(int speed) {
        this.speed -= speed;
        System.out.println("Samochód " + brand + " " + model + " zwolnił do " + this.speed + " km/h.");
    }
}
