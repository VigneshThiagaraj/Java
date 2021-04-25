package com.polymorphism;
public class Car {
    private boolean engine;
    private int cylinder;
    private String name;
    private int wheels;

    public Car(int cylinder, String name) {
        this.name = name;
        this.cylinder = cylinder;
        this.engine = true;
        this.wheels = 4;
    }

    public String startEngine() {
        return this.getClass().getName() + " -> startEngine()";
    }

    public String accelerate() {
        return this.getClass().getName() + " -> accelerate()";
    }

    public String brake() {
        return this.getClass().getName() + " -> brake()";
    }

    public int getCylinder() {
        return this.cylinder;
    }

    public String getName() {
        return this.name;
    }
}
