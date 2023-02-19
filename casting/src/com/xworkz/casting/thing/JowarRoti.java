package com.xworkz.casting.thing;

public class JowarRoti extends AkkiRoti {
	private float thickness;
	
	public JowarRoti () {
		System.out.println("No arguments Constructor in JowarRoti");
	}
 public JowarRoti(float thickness) {
	 this.thickness = thickness;
	 System.out.println("Float in Jowar Roti");
}
 public float getThickness () {
	 return this.thickness;
 }
}
