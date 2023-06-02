package designpatterns.factory.button;

import designpatterns.factory.button.models.Button;
import designpatterns.factory.button.models.PrimaryButton;

public class PrimaryButtonFactory extends ButtonFactory {

    @Override
    public Button createButton() {
        return new PrimaryButton();
    }
}
