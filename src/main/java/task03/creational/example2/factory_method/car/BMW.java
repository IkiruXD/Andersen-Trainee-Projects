package task03.creational.example2.factory_method.car;

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
