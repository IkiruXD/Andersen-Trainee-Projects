package task03.structural.example1.adapter;

public class ToyParrot implements ToyBird{
    @Override
    public void makeSound() {
        System.out.println("toy parrot sound");
    }
}
