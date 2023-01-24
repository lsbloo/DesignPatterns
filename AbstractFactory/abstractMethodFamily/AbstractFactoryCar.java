package criacional.abstractMethod;

import criacional.abstractMethod.model.ModelCar;
import criacional.abstractMethod.model.Specification;

public abstract class AbstractFactoryCar {

    private ModelCar modelCar;
    private Specification hardware;

    public ModelCar getModelCar() {
        return modelCar;
    }

    public Specification getHardware() {
        return hardware;
    }

    public void setHardware(Specification hardware) {
        this.hardware = hardware;
    }

    public void setModelCar(ModelCar modelCar) {
        this.modelCar = modelCar;
    }

}
