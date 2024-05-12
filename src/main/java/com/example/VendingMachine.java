package com.example;

public class VendingMachine {



    Snack getSnack(String snackType) {
        if (snackType.equals("ChocolateBar")) {
            return new ChocolateBar();
        } else if (snackType.equals("Drink")) {
            return new Drink();
        } else {
            return new Chips();
        }

    }


}
