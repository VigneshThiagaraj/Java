package com.oopsconcepts;
public class DeluxeBurger extends Hamburger{

    public DeluxeBurger() {
        super("Deluxe burger", "Sausage & Bacon", 19.10, "White");
        addHamburgerAddition1("Chips",2.75);
        addHamburgerAddition1("Drink",1.81);
    }

    @Override
    public void addHamburgerAddition1(String addition1Name, double addition1Price) {
        System.out.println("Cannot not add additional items to a deluxe burger");
    }

    @Override
    public void addHamburgerAddition2(String addition2Name, double addition2Price) {
        System.out.println( "Cannot not add additional items to a deluxe burger");
    }

    @Override
    public void addHamburgerAddition3(String addition3Name, double addition3Price) {
        System.out.println( "Cannot not add additional items to a deluxe burger");
    }

    @Override
    public void addHamburgerAddition4(String addition2Name, double addition4Price) {
        System.out.println( "Cannot not add additional items to a deluxe burger");
    }
}
