package com.xworkz.casting.boot;

import com.xworkz.casting.thing.AkkiRoti;
import com.xworkz.casting.thing.JowarRoti;
import com.xworkz.casting.thing.RagiRoti;

public class RotiRunner {

	public static void main(String[] args) {
		JowarRoti wheat = new JowarRoti();
		float thickness = wheat.getThickness();
		System.out.println(thickness);
		float weight = wheat.getWeight();
		System.out.println(weight);
		double calorie = wheat.getCalorie();
		System.out.println(calorie);
		String shape = wheat.getShape();
		System.out.println(shape);

		JowarRoti maida = new JowarRoti();
		float thickness1 = maida.getThickness();
		System.out.println(thickness1);
		float weight1 = maida.getWeight();
		System.out.println(weight1);
		double calorie1 = maida.getCalorie();
		System.out.println(calorie1);
		String shape1 = maida.getShape();
		System.out.println(shape1);

		if (maida instanceof JowarRoti) {
			JowarRoti jowarRoti = (JowarRoti) maida;
			float thickness11 = jowarRoti.getThickness();
			System.out.println(thickness11);
		} else {
			System.err.println("maida is not pionting jowarRoti");
		}

		System.out.println("    ");

		RagiRoti roti = new JowarRoti();
		double calorie2 = roti.getCalorie();
		System.out.println(calorie2);
		String shape2 = roti.getShape();
		System.out.println(shape2);

		if (roti instanceof JowarRoti) {
			AkkiRoti akkiRoti = (AkkiRoti) roti;
			float weight2 = akkiRoti.getWeight();
			System.out.println(weight2);
		} else {
			System.out.println("roti is not pointing to the instance of JowarRoti");
		}
		if (roti instanceof JowarRoti) {
			JowarRoti jowarRoti1 = (JowarRoti) roti;
			float thickness2 = jowarRoti1.getThickness();
			System.out.println(thickness2);
		} else {
			System.err.println(" roti is not pointing JowarRoti");
		}
		System.out.println(" ");

	}

}
