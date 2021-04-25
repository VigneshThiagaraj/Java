package com.inheritance;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cuboid cuboid = new Cuboid(25, 30, 15);
		double cubodidArea = cuboid.getArea();
		System.out.println("Area of cuboid is " + cubodidArea);
		
		Cylinder cylinder = new Cylinder(25, 30);
		double cylinderArea = cylinder.getArea();
		System.out.println("Area of cylinder is " + cylinderArea);

	}

}
