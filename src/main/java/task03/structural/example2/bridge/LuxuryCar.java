package task03.structural.example2.bridge;

public class LuxuryCar implements CarPlan {
    ColorFinishPlan colorFinishPlan;

    public LuxuryCar(ColorFinishPlan colorFinishPlan) {
        this.colorFinishPlan = colorFinishPlan;
    }

    public void paintCar() {
        colorFinishPlan.paint();
    }
}
