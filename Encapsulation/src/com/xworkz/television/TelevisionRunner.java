package com.xworkz.television;

public class TelevisionRunner {

	public static void main(String[] args) {

		Television.brand = "LG";
		System.out.println(Television.brand );
		Television.colour = "black";
		Television.price = 667;
		Television.watch("dagsd");
	}

}
