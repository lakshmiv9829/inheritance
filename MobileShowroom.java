package com.xworkz.inheritance;

public class MobileShowroom {

	public static void main(String[] args) {
		Mobile mobile = new Mobile();
		mobile.setBrand("Nokia");
		mobile.setImei("jhs8179");
		mobile.setMemory(32);
		mobile.setPrice(10000);
		System.out.println(mobile.getBrand());
		System.out.println(mobile.getImei());
		System.out.println(mobile.getMemory());
		System.out.println(mobile.getPrice());
		Nokia nokia = new Nokia();
		nokia.setCamera("double");
		System.out.println(nokia.getCamera());
		mobile.call();
		mobile.message();
	}

}
