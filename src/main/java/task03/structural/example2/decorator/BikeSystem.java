package task03.structural.example2.decorator;

public class BikeSystem implements SystemPlan {
    private final int cost;

    BikeSystem() {
        cost = 150;
    }

    public int getSystemCost() {
        return cost;
    }

    public void getSystemDetails() {
        System.out.println("Basic Default system of the Bike");
    }
}
