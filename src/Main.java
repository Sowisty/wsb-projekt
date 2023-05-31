import controllers.CarController;
import models.Car;

public class Main {
    public static void main(String[] args) {
        Car car = new Car("Ford", "Mustang");
        CarController carController = new CarController(car);

        carController.startCar();
        carController.accelerate(80);
        carController.decelerate(30);
        carController.stopCar();
    }
}