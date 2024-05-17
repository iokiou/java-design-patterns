package com.example;

public class App {

    public static void main(String[] args) {
        var englishLocalizedMessage = new EnglishLocalizedMessage();
        var englishGreeting = new Greeting(englishLocalizedMessage);
        englishGreeting.print();

        var frenchLocalizedMessageObject = new FrenchLocalizedMessageObjectAdapter();
        var frenchGreeting = new Greeting(frenchLocalizedMessageObject);
        frenchGreeting.print();

        var frenchLocalizedMessageClass = new FrenchLocalizedMessageClassAdapter();
        frenchGreeting = new Greeting(frenchLocalizedMessageClass);
        frenchGreeting.print();
    }

}
