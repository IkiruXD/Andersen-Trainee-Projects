package task03.creational.example2.builder;

import task03.creational.example2.builder.car.Car;
import task03.creational.example2.builder.car.Director;
import task03.creational.example2.builder.car.category.PremiumCar;

public class BuildCarRunner {

    public static void main(String[] args) {
        Director director = new Director();
        director.setBuilder(new PremiumCar());

        Car car = director.builderCar();

        System.out.println(car);
    }
}