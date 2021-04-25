package com.encapsulation;
public class Main {
    public static void main(String args[]) {
        Printer printer = new Printer(50,true);
        int tonerValue = printer.addToner(100);
        if (tonerValue > 0) {
        	System.out.println(tonerValue);
		} else {
			System.out.println("Toner value cannot be greater than hundred");
		}
        
    }
}
