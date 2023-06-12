package task03.structural.example2.adapter;

public class AdapterCar extends AmericanCar implements Car {

    @Override
    public void getCar() {
        System.out.println("Американский автомобиль: " + getNameCar());
    }
}
