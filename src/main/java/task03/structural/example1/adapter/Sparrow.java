package task03.structural.example1.adapter;

public class Sparrow implements Bird{
    @Override
    public void fly() {
        System.out.println("Yup, i can fly");
    }

    @Override
    public void sound() {
        System.out.println("chip, chip");
    }
}
