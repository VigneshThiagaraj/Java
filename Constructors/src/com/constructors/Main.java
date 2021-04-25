package com.constructors;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Floor floor = new Floor(10,15);
		Carpet carpet = new Carpet(20);
		Calculator cal = new Calculator(floor, carpet);
		double cost = cal.getTotalCost();
		System.out.println(cost);

	}

}
