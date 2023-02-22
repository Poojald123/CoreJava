package com.xworkz.inheritanceequals.boot;

import com.xworkz.inheritanceequals.things.Oven;

public class OvenRunner {

	public static void main(String[] args) {

		Oven oven = new Oven("LG", 30000, 12);
		System.out.println(oven);

		Oven oven2 = new Oven("Sony", 40000, 15);
		System.out.println(oven2);

		boolean equal = oven.equals(oven2);
		System.out.println(equal);

		System.out.println("=========");

		Oven oven3 = new Oven("Haier", 50000, 35);
		System.out.println(oven3);

		boolean same = oven2.equals(oven3);
		System.out.println(same);

	}
}
