package com.xworkz.inheritance;

public class Mobile {
	private String Imei;
	private String brand;
	private int memory;
	private int price;

	public void call() {
		System.out.println("calling property");
	}

	public void message() {
		System.out.println("message property");
	}

	public String getImei() {
		return Imei;
	}

	public void setImei(String imei) {
		Imei = imei;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public int getMemory() {
		return memory;
	}

	public void setMemory(int memory) {
		this.memory = memory;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

}
