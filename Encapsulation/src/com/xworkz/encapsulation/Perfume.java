package com.xworkz.encapsulation;

public class Perfume {

	String name;
	String colour;
	boolean smell;
	String brand;
	int price ;
	
	public Perfume() {
		System.out.println("gsdf");
	}
	public Perfume(String name) {
		this.name=name;
	}
	public Perfume(String name,String colour) {
		this(name);
		this.colour=colour;
	}
	public Perfume(String name,String colour,boolean smell) {
		this(name,colour);
		this.smell=smell;
		
	}
	public Perfume(String name,String colour,boolean smell, String brand) {
		this(name, colour, smell);
		this.brand = brand;
		
	}
	public Perfume(String name,String colour,boolean smell, String brand,int price) {
		this(name,colour, smell , brand);
		this.price =price;
	}
	

	@Override
	public String toString() {
		return "Perfume [name=" + name + ", colour=" + colour + ", smell=" + smell + ", brand=" + brand + ", price="
				+ price + "]";
	}

}
