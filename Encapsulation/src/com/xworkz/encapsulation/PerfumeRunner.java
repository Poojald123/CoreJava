package com.xworkz.encapsulation;

public class PerfumeRunner {

	public static void main(String[] args) {
		System.out.println("ryhfhdfyvgjftuf");

		Perfume perfume = new Perfume();
		System.out.println(perfume);

		Perfume perfume1 = new Perfume("wtr");
		System.out.println(perfume1);
		Perfume perfume2 = new Perfume("xyz", "black");
		System.out.println(perfume2);
		Perfume perfume3 = new Perfume("tac", "blue", true);
		System.out.println(perfume3);
		Perfume perfume4 = new Perfume("vac", "Red", true , " hyt");
		System.out.println(perfume4);
		Perfume perfume5 = new Perfume("gft", "hgd", true , " hdts" , 20);
		System.out.println(perfume5);
	}

}
