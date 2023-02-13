package com.xworkz.variables.thing;

public class Mouse {
	String colour;
	String brand;
	int price ;
	public static void main(String[] args) {
		Mouse mouse=new Mouse();
		mouse.colour="Black";
		mouse.brand="LG";
		mouse.price=70;
		System.out.println("The colour of Mouse is "+ mouse.colour);
		System.out.println("The brand name of Mouse is " +mouse. brand);
		System.out.println("The price of the mouse is " + mouse.price);
		
	}

}
