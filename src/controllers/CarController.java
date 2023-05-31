package controllers;

import interfaces.CarModel;

public class CarController {
    private final CarModel carModel;

    public CarController(CarModel carModel) {
        this.carModel = carModel;
    }

    public void startCar() {
        carModel.startCar();
    }

    public void stopCar() {
        carModel.stopCar();
    }

    public void accelerate(int speed) {
        carModel.accelerate(speed);
    }

    public void decelerate(int speed) {
        carModel.decelerate(speed);
    }
}
