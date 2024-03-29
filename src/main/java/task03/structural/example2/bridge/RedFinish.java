package task03.structural.example2.bridge;

public class RedFinish implements ColorFinishPlan {
    public void paint() {
        chooseColor();
        startPaintMachine();
        System.out.println("Car Painted Successfully");
    }

    public void chooseColor() {
        System.out.println("Red Color Chosen Successfully");
    }

    public void startPaintMachine() {
        System.out.println("Paint Machine Started");
    }
}