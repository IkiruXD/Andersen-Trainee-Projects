package task03.creational.example1.abstractFactoryBuilderPrototype.brandType;

import task03.creational.example1.abstractFactoryBuilderPrototype.Production;

public class Volvo implements Production {
    @Override
    public void getBrand() {
        System.out.println("Car type: Volvo");
    }
}
