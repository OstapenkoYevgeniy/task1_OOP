package com.john.oop.coffee;

public class CoffeeBeans extends Coffee {
	public static enum SizeCoffeeBeans {
		SIEVE_20, SIEVE_19, SIEVE_18, SIEVE_17, SIEVE_16, SIEVE_15, SIEVE_14, SIEVE_13, SIEVE_12
	}

	private SizeCoffeeBeans sizeCoffeeBeans = null;

	public CoffeeBeans(String name, int price, int caffeine,
			SizeCoffeeBeans sizeCoffeeBeans) {
		super.setName(name);
		super.setPrice(price);
		super.setCaffeine(caffeine);
		this.sizeCoffeeBeans = sizeCoffeeBeans;
	}

	public void setCaffeine(int caffeine) {
		if (caffeine >= 380 && caffeine <= 650) {
			super.setCaffeine(caffeine);
		}
	}

	@Override
	public String toString() {
		String rtnStr = "Зерновой кофе \"" + super.getName() + "\" ";
		switch (sizeCoffeeBeans) {
		case SIEVE_12:
			rtnStr += "(Очень мелкое зерно). ";
			break;
		case SIEVE_13:
			rtnStr += "(Мелкое зерно). ";
			break;
		case SIEVE_14:
			rtnStr += "(Малое зерно). ";
			break;
		case SIEVE_15:
			rtnStr += "(Среднее зерно). ";
			break;
		case SIEVE_16:
			rtnStr += "(Хорошее зерно). ";
			break;
		case SIEVE_17:
			rtnStr += "(Достаточно большое зерно). ";
			break;
		case SIEVE_18:
			rtnStr += "(Большое зерно). ";
			break;
		case SIEVE_19:
			rtnStr += "(Экстра большое зерно). ";
			break;
		case SIEVE_20:
			rtnStr += "(Очень зерно). ";
			break;
		}
		rtnStr += " " + super.getCaffeine() + " мл кофеина. Цена: " + super.getPrice() + " KZT.";
		return rtnStr;
	}
}
