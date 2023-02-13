package com.xworkz.constructorchaining;

public class LaptopRunner {

	public static void main(String[] args) {
		System.out.println(" Laptop Properties");
		Laptop laptop = new Laptop();
		System.out.println(laptop);
		Laptop laptop1 = new Laptop("Pooja");
		System.out.println(laptop1);
		Laptop laptop2 = new Laptop("Pooja","dell");
		System.out.println(laptop2);
		Laptop laptop3 = new Laptop("Pooja","dell","black");
		System.out.println(laptop3);
		Laptop laptop4 = new Laptop("Pooja","dell","black",120);
		System.out.println(laptop4);
		Laptop laptop5 = new Laptop("Pooja","dell","black",120,"intel");
		System.out.println(laptop5);
		Laptop laptop6 = new Laptop("Pooja","dell","black",120,"intel","hphp");
		System.out.println(laptop6);
		Laptop laptop7 = new Laptop("Pooja","dell","black",120,"intel","hphp",true);
		//System.out.println(laptop7);
		laptop7.show();
		Laptop laptop8 = new Laptop("Pooja","dell","black",120,"intel","hphp",true,12.5d);
		//System.out.println(laptop8);
		laptop8.show();
		Laptop laptop9 = new Laptop("Pooja","dell","black",120,"intel","hphp",true,12.5d,78);
		//System.out.println(laptop9);
		laptop9.show();
		Laptop laptop10 = new Laptop("Pooja","dell","black",120,"intel","hphp",true,12.5d,78, "Windows");
	//	System.out.println(laptop10);
		laptop10.show();
	}
}
