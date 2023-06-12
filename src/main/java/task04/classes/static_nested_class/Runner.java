package task04.classes.static_nested_class;

public class Runner {
    public static void main(String[] args) {
        Car.Engine engine = new Car.Engine(1.6);
        System.out.println(engine);
        Car car = new Car("Orange", 4, engine);
        System.out.println(car);
    }
}
