package criacional.abstractMethod.model;

import criacional.abstractMethod.AbstractFactoryCar;
import criacional.abstractMethod.Car;

public class NewFiesta implements Car {

    private AbstractFactoryCar mRules = null;

    public NewFiesta(AbstractFactoryCar rules) {
        this.mRules = rules;
    }


    @Override
    public AbstractFactoryCar getRules() {
        return this.mRules;
    }
}
