package task03.creational.example2.builder.car.category;

import task03.creational.example2.builder.car.CarBuilder;
import task03.creational.example2.builder.car.CarModel;

public class EconomyCar extends CarBuilder {
    @Override
    public void buildName() {
        car.setName(CarModel.LADA);
    }

    @Override
    public void buildPrice() {
        car.setPrice(500);
    }
}