package com.xworkz.constructorchaining;

public class Laptop {
	String name;
	String brand;
	String colour;
	int price;
	String processor;
	String model;
	boolean fingerPrint;
	double laptopCode;
	int ram;
	String OperatingSystem;

	public Laptop() {
		System.out.println("dell");
	}

	public Laptop(String name) {
		this.name = name;
	}

	public Laptop(String name, String brand) {
		this(name);
		this.brand = brand;
	}

	public Laptop(String name, String brand, String colour) {
		this(name, brand);
		this.colour = colour;
	}

	public Laptop(String name, String brand, String colour, int price) {
		this(name, brand, colour);
		this.price = price;
	}

	public Laptop(String name, String brand, String colour, int price, String processor) {
		this(name, brand, colour, price);
		this.processor = processor;
	}

	public Laptop(String name, String brand, String colour, int price, String processor, String model) {
		this(name, brand, colour, price, processor);
		this.model = model;
	}

	public Laptop(String name, String brand, String colour, int price, String processor, String model,
			boolean fingerPrint) {
		this(name, brand, colour, price, processor, model);
		this.fingerPrint = fingerPrint;
	}

	public Laptop(String name, String brand, String colour, int price, String processor, String model,
			boolean fingerPrint, double laptopCode) {
		this(name, brand, colour, price, processor, model, fingerPrint);
		this.laptopCode = laptopCode;
	}

	public Laptop(String name, String brand, String colour, int price, String processor, String model,
			boolean fingerPrint, double laptopCode, int ram) {
		this(name, brand, colour, price, processor, model, fingerPrint, laptopCode);
		this.ram = ram;
	}

	public Laptop (String name,String brand,String colour,int price, String processor,String model,boolean fingerPrint,double laptopCode,int ram,String OperatingSystem) {
		this(name, brand , colour,price,processor, model, fingerPrint, laptopCode, ram);
		this.OperatingSystem = OperatingSystem;
	}
	public void show() {
		System.out.println(name);
		System.out.println(brand);
		System.out.println(colour);
		System.out.println(price);
		System.out.println(processor);
		System.out.println(model);
		System.out.println(fingerPrint);
		System.out.println(laptopCode);
		System.out.println(ram);
		System.out.println(OperatingSystem);
		
	}
	

}