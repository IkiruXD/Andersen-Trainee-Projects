package task03.structural.example2.flyweight;

import java.util.ArrayList;
import java.util.List;

public class Runner {
    public static void main(String[] args) {
        CarFactory carFactory = new CarFactory();
        List<Car> cars = new ArrayList<>();

        cars.add(carFactory.getCarByModel("BMW"));
        cars.add(carFactory.getCarByModel("BMW"));
        cars.add(carFactory.getCarByModel("BMW"));
        cars.add(carFactory.getCarByModel("Mercedes"));
        cars.add(carFactory.getCarByModel("Mercedes"));
        cars.add(carFactory.getCarByModel("Mercedes"));
        cars.add(carFactory.getCarByModel("Mercedes"));
        cars.add(carFactory.getCarByModel("Mercedes"));

        for (Car car : cars) {
            car.produceACar();
        }
    }
}
