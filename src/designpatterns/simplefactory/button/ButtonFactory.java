package designpatterns.simplefactory.button;

import designpatterns.factory.button.models.Button;
import designpatterns.factory.button.models.ButtonType;
import designpatterns.factory.button.models.PrimaryButton;
import designpatterns.factory.button.models.RoundButton;


public class ButtonFactory {
    public static Button createButton(ButtonType type)
    {
//        switch(type) {
//            case PRIMARY:
//                return new PrimaryButton();
//            case ROUND:
//                return new RoundButton();
//        }
//
//        throw new IllegalArgumentException("Invalid button type");

        return switch (type) {
            case PRIMARY -> new PrimaryButton();
            case ROUND -> new RoundButton();
        };

    }
}
