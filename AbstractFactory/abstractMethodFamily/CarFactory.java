package criacional.abstractMethod;

import criacional.abstractMethod.model.Combi;
import criacional.abstractMethod.model.NewFiesta;
import criacional.abstractMethod.model.Virtus;

public class CarFactory {
    public static Car createCar(AbstractFactoryCar rules, FactoryModelCarTypeEnum modelCarType) {
        switch (modelCarType) {
            case NEW_FIESTA -> {
                return new NewFiesta(rules);
            }
            case COMBI ->  {
                return new Combi(rules);
            }
            case VIRTUS -> {
                return new Virtus(rules);
            }
        }
        return null;
    }
}
