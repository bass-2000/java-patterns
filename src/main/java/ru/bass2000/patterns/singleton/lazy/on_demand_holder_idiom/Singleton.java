package ru.bass2000.patterns.singleton.lazy.on_demand_holder_idiom;

public class Singleton {

    public static Singleton getInstance() {
        return SingletonHolder.HOLDER_INSTANCE;
    }

    public static class SingletonHolder {
        public static final Singleton HOLDER_INSTANCE = new Singleton();
    }
}
