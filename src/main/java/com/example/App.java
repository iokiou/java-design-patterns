package com.example;

public class App {


    public static void main(String[] args) {
        UserInterface roadUserInterface = createUserInterface("RED");
        UserInterface mountainUserInterface = createUserInterface("BLUE");

        System.out.println(roadUserInterface);
        System.out.println(mountainUserInterface);

    }

    private static UserInterface createUserInterface(String color) {
        UIFactory uiFactory = FactoryMaker.createFactory(color);
        return new UserInterface(uiFactory.createButton(), uiFactory.createScrollBar());
    }

}

