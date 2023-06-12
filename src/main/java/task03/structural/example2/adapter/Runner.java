package task03.structural.example2.adapter;

public class Runner {
    public static void main(String[] args) {
        Car car = new AdapterCar();
        car.getCar();
    }
}
