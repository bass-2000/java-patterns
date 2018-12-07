package ru.bass2000.patterns.builder.builders;

import ru.bass2000.patterns.builder.cars.Type;
import ru.bass2000.patterns.builder.components.Engine;
import ru.bass2000.patterns.builder.components.GPSNavigator;
import ru.bass2000.patterns.builder.components.Transmission;
import ru.bass2000.patterns.builder.components.TripComputer;

/**
 * Интерфейс Строителя объявляет все возможные этапы и шаги конфигурации
 * продукта.
 */
public interface Builder {
    void setType(Type type);

    void setSeats(int seats);

    void setEngine(Engine engine);

    void setTransmission(Transmission transmission);

    void setTripComputer(TripComputer tripComputer);

    void setGPSNavigator(GPSNavigator gpsNavigator);
}