package designpatterns.structural.decorator.iceream;

import java.security.InvalidParameterException;

public class ChocolateScoop implements IceCreamCone {
    private IceCreamCone iceCreamCone;

    public  ChocolateScoop(IceCreamCone iceCreamCone) {
        if(iceCreamCone == null) {
            throw new InvalidParameterException();
        }
        this.iceCreamCone = iceCreamCone;
    }
    @Override
    public int getCost() {
        return iceCreamCone.getCost() + 20;
    }

    @Override
    public String getConstituents() {
        return iceCreamCone.getConstituents() + " Chocolate";
    }
}
