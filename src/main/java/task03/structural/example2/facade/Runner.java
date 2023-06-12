package task03.structural.example2.facade;

public class Runner {

    public static void main(String[] args) {
        try {
            AutoPilot ap = new AutoPilot();
            ap.start();
        } catch (Exception e) {
            System.out.println("whatSup");
        }
    }

}
