package task03.creational.example1.abstractFactoryBuilderPrototype.transmissionType;

import task03.creational.example1.abstractFactoryBuilderPrototype.Transmission;

public class FrontWheelDrive implements Transmission {
    @Override
    public void getTransmission() {
        System.out.println("Transmission type: Front Wheel Drive");
    }
}
