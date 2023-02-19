package com.xworkz.casting.thing;

public class Roti {
	private String shape;
	public Roti () {
		System.out.println("No arguments Constructor in Roti");

	}
public Roti (String shape) {
	this.shape = shape;
	System.out.println(" String in Roti");
}
 public String getShape() {
	 return this.shape;
 }
}
