package com.john.oop.coffee;

import com.john.oop.coffee.CoffeeBeans.SizeCoffeeBeans;

public class InstantCoffee extends Coffee{
	public static enum ModeOfProduction {
		SUBLIMATED, SPRAY_DRYDEN, GRANULATED
	}

	private ModeOfProduction modeOfProduction = null;
	
	public InstantCoffee(String name,float price, float caffeine, ModeOfProduction modeOfProduction) {
		super.setName(name);
		super.setPrice(price);
		super.setCaffeine(caffeine);
		this.modeOfProduction = modeOfProduction;
	}
}
