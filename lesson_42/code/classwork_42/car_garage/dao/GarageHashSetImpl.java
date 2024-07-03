package classwork_42.car_garage.dao;

import classwork_42.car_garage.model.Car;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class GarageHashSetImpl implements Garage {
//Comparator<Car>
    private Set<Car> cars;
    private int capacity;

    // Constructor
    public GarageHashSetImpl(int capacity) {
        cars = new HashSet<>();
        this.capacity = capacity;
    }

    // O(1); O(n)


    @Override
    public boolean addCar(Car car) {
        if (car == null || cars.size() == capacity) {
            return false;
        }
        if(cars.add(car)){

            return true;
        } else {
            return false;
        }
    }

    // O(1), O(n)
    @Override
    public Car removeCar(String regNumber) {
        Car car = findCarByRegNumber(regNumber);
        // remove
        cars.remove(car);
        return car;
    }

    // O(n)
    @Override
    public Car findCarByRegNumber(String regNumber) {
        for (Car car : cars) {
            if(car.getRegNumber().equals(regNumber)){
                return car;
            }

        }

       return null;
    }
    // O(n)
    @Override
    public Car[] findCarsByModel(String model) {
        List<Car> tempList = new ArrayList<>();
        for (Car car : cars) {
            if (car.getModel().equals(model)) {
                tempList.add(car);
            }
        }
        // TODO sort ArrayList
        Car[] temp = new Car[tempList.size()];
        for (int i = 0; i < tempList.size(); i++) {
            temp[i] = tempList.get(i);

        }
        return temp;
    }
        /*int count = 0;

        for (Car car : cars) {
            if(car.getModel().equals(model)) {
               count++;
            }
        }
        //for (int i = 0; i < cars.size(); i++) {
          //  if(cars.get(i).equals(model)){
           //     count++;
           // }
       // }

        Car[] temp = new Car[count];

        for (int j = 0; j < temp.length; j++) {
            for (Car car : cars) {
              if(car.getModel().equals(model)){
                  temp[j] = car;
              }
            }
        }
        return temp; */

    // O(n)
    @Override
    public Car[] findCarsByCompany(String company) {

        List<Car> tempList = new ArrayList<>();
        for (Car car : cars) {
            if (car.getCompany().equals(company)) {
                tempList.add(car);
            }
        }
        Car[] temp = new Car[tempList.size()];
        for (int i = 0; i < tempList.size(); i++) {
            temp[i] = tempList.get(i);

        }
        return temp;
    }



        /*int count = 0;
        for (int i = 0; i < cars.size(); i++) {
            if(cars.get(i).getCompany().equals(company)){
                count++;
            }
        }


        Car[] temp = new Car[count];
        int j = 0;
        for (int i = 0; i < cars.size(); i++ ) {
            if(cars.get(i).getCompany().equals(company)){
                temp[j] = cars.get(i);
                j++;
            }
        }
        return temp;
    } */
    // O(n)
    @Override
    public Car[] findCarsByColor(String color) {
        List<Car> tempList = new ArrayList<>();
        for (Car car : cars) {
            if (car.getColor().equals(color)) {
                tempList.add(car);
            }
        }
        Car[] temp = new Car[tempList.size()];
        for (int i = 0; i < tempList.size(); i++) {
            temp[i] = tempList.get(i);

        }
        return temp;
    }

        /*int count = 0;
        for (int i = 0; i < cars.size(); i++) {
            if(cars.get(i).getColor().equals(color)){
                count++;
            }
        }


        Car[] temp = new Car[count];
        int j = 0;
        for (int i = 0; i < cars.size(); i++ ) {
            if(cars.get(i).getColor().equals(color)){
                temp[j] = cars.get(i);
                j++;
            }
        }
        return temp;
    } */
    // O(n)
    @Override
    public Car[] findCarsByEngine(double min, double max) {
        /*int count = 0;
        for (int i = 0; i < cars.size(); i++) {
            if(cars.get(i).getEngine() > min && cars.get(i).getEngine() < max){
                count++;
            }
        }
        Car[] temp = new Car[count];
        int j = 0;
        for (int i = 0; i < cars.size(); i++ ) {
            if(cars.get(i).getEngine() > min && cars.get(i).getEngine() < max){
                temp[j] = cars.get(i);
                j++;
            }
        }
        return temp;
    } */

        List<Car> tempList = new ArrayList<>();
        for (Car car : cars) {
            if (car.getEngine() > min && car.getEngine() < max) {
                tempList.add(car);
            }
        }
        Car[] temp = new Car[tempList.size()];
        for (int i = 0; i < tempList.size(); i++) {
            temp[i] = tempList.get(i);
        }
        return temp;

    }
}
