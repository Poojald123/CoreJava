package com.xworkz.inheritanceusingmethod.things;

public class Sport {
public String place;

  public Sport() {
	 System.out.println("No arguments Constructor in Sport"); 
  }
 public Sport ( String place) {
	 this.place = place;
	 System.out.println(" String Constructor in Sport");
 }
 public String getplace () {
	 return place;
 }
}
