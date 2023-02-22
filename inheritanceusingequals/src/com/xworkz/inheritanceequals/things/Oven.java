package com.xworkz.inheritanceequals.things;

public class Oven {

	private String brand;
	private double price;
	private int size;

	public Oven() {
		System.out.println("No arguments Constructor in Oven");
	}

	public Oven(String brand, double price, int size) {
		System.out.println("Running String , double  and int in Oven");
		this.brand = brand;
		this.price = price;
		this.size = size;
	}

	@Override
	public String toString() {
		System.out.println("Overriding toString in Oven.. ");
		return "Brand : " + this.brand + " Price : " + this.price + " Size :" + this.size;
	}

	@Override
	public boolean equals(Object obj) {
		System.out.println("Overriding equals in Oven" + obj);
		if (obj != null) {
			System.out.println("obj is not null..");
			if (obj instanceof Oven) {
				System.out.println("obj is of Oven type");
				Oven casted = (Oven) obj;
				Oven left = this;
				Oven right = casted;
				if (left.brand.equals(right.brand) && left.price == right.price && left.size == right.size) {
					return true;
				} else {
					System.out.println("left and right is not same");
				}
			} else {
				System.out.println("obj is not oven type");
			}
		} else {
			System.out.println("obj is null");
		}

		return super.equals(obj);
	}
}