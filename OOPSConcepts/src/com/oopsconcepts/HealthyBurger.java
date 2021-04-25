package com.oopsconcepts;
public class HealthyBurger extends Hamburger{

    private String healthyExtra1Name;
    private double healthyExtra1Price;
    private String healthyExtra2Name;
    private double healthyExtra2Price;

    public HealthyBurger(String meat, double price) {
        super("Healthy hamburger",meat,price,"Brown rye");
    }

    public void addHealthyAddition1(String addition1Name, double addition1Price){
        this.healthyExtra1Price += addition1Price;
        this.healthyExtra1Name = addition1Name;
    }
    public void addHealthyAddition2(String addition2Name, double addition2Price){
        this.healthyExtra2Price += addition2Price;
        this.healthyExtra1Name = addition2Name;
    }

    @Override
    public double itemizeHamburger() {
        return ( super.itemizeHamburger() + healthyExtra1Price + healthyExtra2Price);
    }
}
