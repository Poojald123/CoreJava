package com.xworkz.casting.thing;

public class RagiRoti extends Roti {
 private double calorie;
 public RagiRoti () {
	 System.out.println(" no arguments Constructor in RagiRoti");
 }
 public RagiRoti(double calorie) {
	 this.calorie = calorie;
	 System.out.println(" double in RagiRoti");
	
 }
  public double getCalorie () {
	  return this.calorie ;
  }
}
