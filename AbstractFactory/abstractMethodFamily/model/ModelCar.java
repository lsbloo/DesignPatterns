package criacional.abstractMethod.model;

import criacional.abstractMethod.FactoryCarTypeEnum;
import criacional.abstractMethod.FactoryModelCarTypeEnum;

public class ModelCar {
    String name;
    String brand;
    int yearOfFabricant;
    FactoryCarTypeEnum type;

    public ModelCar(String name, String brand, int yearOfFabricant, FactoryCarTypeEnum typeEnum) {
        this.name = name;
        this.brand = brand;
        this.yearOfFabricant = yearOfFabricant;
        this.type = typeEnum;
    }
}
