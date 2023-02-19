package com.xworkz.casting.thing;

public class AkkiRoti extends RagiRoti{
	private float weight ;
	public AkkiRoti() {
		System.out.println("no arguments Constructor in AkkiRoti");
	}
 public AkkiRoti( float weight) {
	 this.weight = weight;
	 System.out.println(" Float in AkkiRoti");
 }
 public float getWeight() {
	 return this.weight;
 }
}
