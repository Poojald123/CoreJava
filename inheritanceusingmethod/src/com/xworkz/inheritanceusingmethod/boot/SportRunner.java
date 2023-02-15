package com.xworkz.inheritanceusingmethod.boot;

import com.xworkz.inheritanceusingmethod.things.Cricket;
import com.xworkz.inheritanceusingmethod.things.Sport;

public class SportRunner {
	public static void main (String[] args) {
		Cricket cricket = new Cricket();
		cricket.play();
		String location = cricket.getplace();
		System.out.println(" location");
		
		Sport sport = new Cricket ();
		String location1 = sport.getplace();
		System.out.println(" location1");
		
		Cricket cricket2 = (Cricket) sport;
		cricket2.play();
	}
	

}
