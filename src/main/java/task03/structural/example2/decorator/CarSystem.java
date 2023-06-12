package task03.structural.example2.decorator;

public class CarSystem implements SystemPlan {
    private final int cost;

    CarSystem() {
        cost = 250;
    }

    public int getSystemCost() {
        return cost;
    }

    public void getSystemDetails() {
        System.out.println("Basic Default system of the Car");
    }
}
