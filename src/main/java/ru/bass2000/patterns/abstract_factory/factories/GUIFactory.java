package ru.bass2000.patterns.abstract_factory.factories;

import ru.bass2000.patterns.abstract_factory.buttons.Button;
import ru.bass2000.patterns.abstract_factory.checkboxes.Checkbox;

/**
 * Абстрактная фабрика знает обо всех (абстрактных) типах продуктов.
 */
public interface GUIFactory {
    Button createButton();

    Checkbox createCheckbox();
}