package com.classandobjects.levelone;

public class MobilePhone {
	//Declaring variable for entering the details
	String brand;
	String model;
	double price;
	
	//constructor
	MobilePhone(String brand,String model,double price){
		this.brand = brand;
		this.model = model;
		this.price = price;
	}
	
	public void diplayMobile() {
		System.out.println("Brand of mobile: "+brand);
		System.out.println("Model of mobile: "+model);
		System.out.println("Price of mobile: "+price);
		System.out.println("------------------------------");
	}
	public static void main(String[] args) {
	MobilePhone mobile1=new MobilePhone("VIVO","VIVO V29" , 15999);
	MobilePhone mobile2=new MobilePhone("ONE PLUS","ONE PLUS nord4",39999);
	MobilePhone mobile3=new MobilePhone("APPLE","iphone pro16",79999);
	
	mobile1.diplayMobile();
	mobile2.diplayMobile();
	mobile3.diplayMobile();
	}
}
