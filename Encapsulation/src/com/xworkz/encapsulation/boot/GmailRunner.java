package com.xworkz.encapsulation.boot;

import com.xworkz.encapsulation.things.Gmail;

public class GmailRunner {

	public static void main(String[] args) {
		Gmail gmail = new Gmail ();
		gmail.setName("Appu");
		gmail.setgender("Male");
		gmail.setAge(24);
		
		String name = gmail.getName();
		System.out.println(name);
		String gender = gmail.getgender();
		System.out.println(gender);
		int age = gmail.getage();
		System.out.println(age);

	}

}
