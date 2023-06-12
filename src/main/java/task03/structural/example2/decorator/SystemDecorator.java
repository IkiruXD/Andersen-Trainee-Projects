package task03.structural.example2.decorator;

abstract class SystemDecorator implements SystemPlan {
    SystemPlan systemPlan;

    SystemDecorator(SystemPlan systemPlan) {
        this.systemPlan = systemPlan;
    }

    public int getSystemCost() {
        return systemPlan.getSystemCost();
    }

    public void getSystemDetails() {
        systemPlan.getSystemDetails();
    }
}
