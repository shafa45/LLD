package designpatterns.factory.button.models;

public class PrimaryButton implements Button {
    @Override
    public void render() {
        System.out.println("Rendering primary button");
    }

    @Override
    public void onClick() {
        System.out.println("Primary Button clicked!");
    }
}
