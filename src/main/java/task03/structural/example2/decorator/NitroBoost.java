package task03.structural.example2.decorator;

class NitroBoost extends SystemDecorator {
    NitroBoost(SystemPlan systemPlan) {
        super(systemPlan);
    }

    public int getSystemCost() {
        return 25 + this.systemPlan.getSystemCost();
    }

    public void getSystemDetails() {
        this.systemPlan.getSystemDetails();
        System.out.println("Nitro Boost System");
    }
}
