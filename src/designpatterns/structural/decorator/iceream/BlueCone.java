package designpatterns.structural.decorator.iceream;

public class BlueCone implements IceCreamCone {
    @Override
    public int getCost() {
        return 20;
    }

    @Override
    public String getConstituents() {
        return "BlueCone";
    }
}
