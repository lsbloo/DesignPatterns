package criacional.abstractMethod.model;

import criacional.abstractMethod.AbstractFactoryCar;
import criacional.abstractMethod.Car;

public class Virtus implements Car {

    private AbstractFactoryCar mRules = null;

    public Virtus(AbstractFactoryCar rules) {
        this.mRules = rules;
    }

    @Override
    public AbstractFactoryCar getRules() {
        return this.mRules;
    }
}
