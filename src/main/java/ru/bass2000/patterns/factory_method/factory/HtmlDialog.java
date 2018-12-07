package ru.bass2000.patterns.factory_method.factory;

import ru.bass2000.patterns.factory_method.buttons.Button;
import ru.bass2000.patterns.factory_method.buttons.HtmlButton;

/**
 * HTML-диалог.
 */
public class HtmlDialog extends Dialog {

    @Override
    public Button createButton() {
        return new HtmlButton();
    }
}