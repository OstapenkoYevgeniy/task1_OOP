package com.john.oop.coffee;

public abstract class Coffee {

	private String name;
	private int price; // KZT
	private int caffeine; // mg
	
	public String getName() {
		return name;
	}

	public int getPrice() {
		return price;
	}
	
	public int getCaffeine() {
		return caffeine;
	}

	public void setName(String name) {
		if (name.trim() != "") {
			this.name = name;
		}
	}

	public void setPrice(int price) {
		if (price > 0) {
			this.price = price;
		}
	}
	
	public void setCaffeine(int caffeine) {
		if (caffeine > 0) {
			this.caffeine = caffeine;
		}
	}
}
