package com.example;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;

public class FactoryMaker {

    private static final Map<String, Supplier<UIFactory>> uiFactories = new HashMap<>();

    static {
        uiFactories.put("BLUE", BlueUIFactory::new);
        uiFactories.put("RED", RedUIFactory::new);
    }

    public static UIFactory createFactory(String color) {
        if (uiFactories.containsKey(color)) {
            return uiFactories.get(color).get();
        } else {
            throw new IllegalArgumentException("Color not supported");
        }
    }

}
