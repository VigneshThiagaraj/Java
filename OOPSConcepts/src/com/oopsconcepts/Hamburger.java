package com.oopsconcepts;
public class Hamburger {
    private String name;
    private String meat;
    private double price;
    private String breadRollType;

    private String addition1Name;
    private String addition2Name;
    private String addition3Name;
    private String addition4Name;

    private double addition1Price;
    private double addition2Price;
    private double addition3Price;
    private double addition4Price;

    public Hamburger(String name, String meat, double price, String breadRollType) {
        this.name = name;
        this.meat = meat;
        this.price = price;
        this.breadRollType = breadRollType;
    }

    public void addHamburgerAddition1(String addition1Name, double addition1Price){
        this.addition1Price += addition1Price;
        this.addition1Name = addition1Name;
    }
    public void addHamburgerAddition2(String addition2Name, double addition2Price){
        this.addition2Price += addition2Price;
        this.addition2Name = addition2Name;
    }

    public void addHamburgerAddition3(String addition3Name, double addition3Price){
        this.addition3Price += addition3Price;
        this.addition3Name = addition3Name;
    }

    public void addHamburgerAddition4(String addition4Name, double addition4Price){
        this.addition4Price += addition4Price;
        this.addition4Name = addition4Name;
    }
    public double itemizeHamburger(){
        this.price += this.addition1Price + this.addition2Price + this.addition3Price + this.addition4Price;
        return this.price;
    }
}
