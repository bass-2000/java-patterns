package ru.bass2000.patterns.abstract_factory.factories;

import ru.bass2000.patterns.abstract_factory.buttons.Button;
import ru.bass2000.patterns.abstract_factory.buttons.WindowsButton;
import ru.bass2000.patterns.abstract_factory.checkboxes.Checkbox;
import ru.bass2000.patterns.abstract_factory.checkboxes.WindowsCheckbox;

/**
 * Каждая конкретная фабрика знает и создаёт только продукты своей вариации.
 */
public class WindowsFactory implements GUIFactory {

    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new WindowsCheckbox();
    }
}