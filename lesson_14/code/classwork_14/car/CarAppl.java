package classwork_14.car;

import classwork_14.car.model.Car;

public class CarAppl {
    public static void main(String[] args) {

        Car car = new Car("white", "BMW", false, 25000, 2005, 258000);

        car.displayCar();
        car.moveCar();
    }
}
