package com.john.oop.coffee;

import com.john.oop.coffee.GroundCoffee.Grinding;

public class CoffeeBeans extends Coffee{
	public static enum SizeCoffeeBeans {
		SIEVE_20, SIEVE_19, SIEVE_18, SIEVE_17, SIEVE_16, SIEVE_15, SIEVE_14, SIEVE_13, SIEVE_12
	}
	
	private SizeCoffeeBeans sizeCoffeeBeans = null;
	
	public CoffeeBeans(String name,float price, int caffeine, SizeCoffeeBeans sizeCoffeeBeans) {
		super.setName(name);
		super.setPrice(price);
		super.setCaffeine(caffeine);
		this.sizeCoffeeBeans = sizeCoffeeBeans;
	}
	
	public void setCaffeine(int caffeine) {
		if (caffeine >= 380 && caffeine <= 650) {
			super.setCaffeine(caffeine);
		} else {
			System.out.println("Неверное значение кофеина!");
		}
	}
}

