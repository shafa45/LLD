package designpatterns.factory.button.models;

public class RoundButton implements   Button{
    @Override
    public void render() {
        System.out.println("Rendering Round button");
    }

    @Override
    public void onClick() {
        System.out.println("Round button Clicked!");

    }
}
