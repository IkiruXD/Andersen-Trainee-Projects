package task03.structural.example2.proxy;

public class Driver {
    private final int age;
    private final String name;

    Driver(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }
}