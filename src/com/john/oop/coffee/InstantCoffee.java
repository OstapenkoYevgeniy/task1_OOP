package com.john.oop.coffee;

import com.john.oop.coffee.CoffeeBeans.SizeCoffeeBeans;

public class InstantCoffee extends Coffee {
	public static enum ModeOfProduction {
		SUBLIMATED, SPRAY_DRYDEN, GRANULATED
	}

	private ModeOfProduction modeOfProduction = null;

	public InstantCoffee(String name, int price, int caffeine, ModeOfProduction modeOfProduction) {
		super.setName(name);
		super.setPrice(price);
		super.setCaffeine(caffeine);
		this.modeOfProduction = modeOfProduction;
	}

	public ModeOfProduction getModeOfProduction() {
		return modeOfProduction;
	}
	
	public void setCaffeine(int caffeine) {
		if (caffeine >= 310 && caffeine <= 480) {
			super.setCaffeine(caffeine);
		} else {
			throw new RuntimeException("Invalid value");
		}
	}

	@Override
	public String toString() {
		String rtnStr = "Растворимый кофе \"" + super.getName() + "\" ";
		switch (modeOfProduction) {
		case GRANULATED:
			rtnStr += "(Гранулированный). ";
			break;
		case SPRAY_DRYDEN:
			rtnStr += "(Спрей-драйд). ";
			break;
		case SUBLIMATED:
			rtnStr += "(Сублимированный). ";
			break;
		}
		rtnStr += " " + super.getCaffeine() + " мл кофеина. Цена: " + super.getPrice() + " KZT.";
		return rtnStr;
	}
}
