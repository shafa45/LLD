package designpatterns.factory.button;

import designpatterns.factory.button.models.Button;

import java.util.ArrayList;
import java.util.List;

public class Client {
    public static void main(String[] args) {
        ButtonFactory primaryButtonFactory = new PrimaryButtonFactory();
        ButtonFactory roundButtonFactory = new RoundButtonFactory();
        List<Button> buttonList = new ArrayList<>();
        buttonList.add(primaryButtonFactory.createButton());
        buttonList.add(roundButtonFactory.createButton());
        for(Button button: buttonList) {
            button.render();
            button.onClick();
        }
    }
}
