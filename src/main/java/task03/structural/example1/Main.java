package task03.structural.example1;

import task03.structural.example1.adapter.*;

public class Main {
    public static void main(String[] args) {
        Parrot parrot = new Parrot();
        ToyBird toy = new ToyParrot();
        ToyBird adapter = new BirdAdapter(parrot);
        parrot.fly();
        parrot.sound();
        toy.makeSound();
        adapter.makeSound();
    }
}
