package task03.creational.example2.abstract_factory.car;

import task03.creational.example2.abstract_factory.transport_interface.Car;

public class BMW implements Car {
    @Override
    public void drive() {
        System.out.println("Автомобиль BMW поехал.");
    }

    @Override
    public void stop() {
        System.out.println("Автомобиль BMW остановился.");
    }
}