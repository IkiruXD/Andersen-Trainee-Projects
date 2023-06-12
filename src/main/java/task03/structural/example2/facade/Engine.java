package task03.structural.example2.facade;

public class Engine implements CarSystemPlan {
    public void turnOn() {
        System.out.println("Engine started");
    }

    public void turnOff() {
        System.out.println("Engine is turned off");
    }
}