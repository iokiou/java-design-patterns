package com.example;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;

public class VendingMachine {

    private static final Map<String, Supplier<Snack>> snacksMap = new HashMap<>();

    static {
        snacksMap.put("ChocolateBar", ChocolateBar::new);
        snacksMap.put("Drink", Drink::new);
        snacksMap.put("Chips", Chips::new);
    }

    Snack getSnack(String snackType) {
        if (snacksMap.containsKey(snackType)) {
            return snacksMap.get(snackType).get();
        } else {
            throw new IllegalArgumentException("No such snack type exists: " + snackType);
        }
    }


}
