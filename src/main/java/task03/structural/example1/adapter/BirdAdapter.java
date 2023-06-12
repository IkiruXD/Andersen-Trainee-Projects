package task03.structural.example1.adapter;

public class BirdAdapter  implements ToyBird{

    Bird bird;

    public BirdAdapter(Bird bird) {
        this.bird = bird;
    }

    @Override
    public void makeSound() {
        bird.sound();
    }
}
