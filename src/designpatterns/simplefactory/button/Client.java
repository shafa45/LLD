package designpatterns.simplefactory.button;
import designpatterns.factory.button.models.Button;
import designpatterns.factory.button.models.ButtonType;

import java.util.ArrayList;
import java.util.List;

public class Client {
    public static void main(String[] args) {
        Button primaryButton =  ButtonFactory.createButton(ButtonType.PRIMARY);
        Button roundButton =  ButtonFactory.createButton(ButtonType.ROUND);
        List<Button> buttonList = new ArrayList<>();
        buttonList.add(primaryButton);
        buttonList.add(roundButton);
        for(Button button: buttonList) {
            button.render();
            button.onClick();
        }
    }
}
