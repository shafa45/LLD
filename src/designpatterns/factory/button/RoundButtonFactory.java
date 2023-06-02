package designpatterns.factory.button;

import designpatterns.factory.button.models.Button;
import designpatterns.factory.button.models.RoundButton;

public class RoundButtonFactory extends ButtonFactory {

    @Override
    public Button createButton() {
        return new RoundButton();
    }
}
