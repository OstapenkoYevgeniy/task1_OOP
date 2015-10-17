package com.john.oop.coffee;

public abstract class Coffee {

	private String name;
	private float price;
	private int caffeine; // mg/l
	
	public String getName() {
		return name;
	}

	public float getPrice() {
		return price;
	}
	
	public float getCaffeine() {
		return caffeine;
	}

	public void setName(String name) {
		if (name.trim() != "") {
			this.name = name;
		}
	}

	public void setPrice(float price) {
		if (price < 0) {
			this.price = price;
		}
	}
	
	public void setCaffeine(int caffeine) {
		if (caffeine < 0) {
			this.caffeine = caffeine;
		}
	}
}
