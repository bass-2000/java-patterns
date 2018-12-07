package ru.bass2000.patterns.factory_method.factory;

import ru.bass2000.patterns.factory_method.buttons.Button;
import ru.bass2000.patterns.factory_method.buttons.WindowsButton;

/**
 * Диалог на элементах операционной системы.
 */
public class WindowsDialog extends Dialog {

    @Override
    public Button createButton() {
        return new WindowsButton();
    }
}