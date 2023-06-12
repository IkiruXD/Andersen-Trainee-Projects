package task03.structural.example2.bridge;

public class SedanCar implements CarPlan {
    ColorFinishPlan colorFinishPlan;

    public SedanCar(ColorFinishPlan colorFinishPlan) {
        this.colorFinishPlan = colorFinishPlan;
    }

    public void paintCar() {
        colorFinishPlan.paint();
    }
}
