package com.example.testndkeclipse;

public class Animal {

    protected String name;

    public Animal(String name) {
        this.name = name;
        System.out.println("Animal Construct call...");
    }

    public String getName() {
        System.out.println("Animal.getName Call...");
        return this.name;
    }

    public void run() {
        System.out.println("Animal.run...");
    }   
}
