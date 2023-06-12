package task03.creational.example1.abstractFactoryBuilderPrototype.transmissionType;

import task03.creational.example1.abstractFactoryBuilderPrototype.Transmission;

public class FourWheelDrive implements Transmission {
    @Override
    public void getTransmission() {
        System.out.println("Transmission type: Four Wheel Drive");
    }
}
