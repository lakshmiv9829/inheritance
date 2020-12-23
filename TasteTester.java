package com.xworkz.inheritance;

public class TasteTester {

	public static void main(String[] args) {
		Cake cake = new Cake();
		cake.setFlavour("chocolate");
		cake.setShape("round");
		cake.setSize(1.0);
		System.out.println(cake.getFlavour());
		System.out.println(cake.getShape());
		System.out.println(cake.getSize());
		HoneyCake honeyCake = new HoneyCake();
		honeyCake.setIshoney(true);
		System.out.println(honeyCake.isIshoney());
		cake.taste();
	}
}

