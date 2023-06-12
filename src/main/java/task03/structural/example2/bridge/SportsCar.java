package task03.structural.example2.bridge;

public class SportsCar implements CarPlan {
    ColorFinishPlan colorFinishPlan;

    public SportsCar(ColorFinishPlan colorFinishPlan) {
        this.colorFinishPlan = colorFinishPlan;
    }

    public void paintCar() {
        colorFinishPlan.paint();
    }
}