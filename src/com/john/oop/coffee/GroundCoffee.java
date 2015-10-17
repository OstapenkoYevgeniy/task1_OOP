package com.john.oop.coffee;

public class GroundCoffee extends Coffee {

	public static enum Grinding {
		COARSE, MIDDLE_GROUND, FINE_GRINDING, SUPERFINE_GRINDING
	}

	private Grinding grinding = null;

	public GroundCoffee(String name,float price, float caffeine, Grinding grinding) {
		super.setName(name);
		super.setPrice(price);
		super.setCaffeine(caffeine);
		this.grinding = grinding;
	}
	
	public Grinding getGrinding() {
		return grinding;
	}

	public void setGrinding(Grinding grinding) {
		this.grinding = grinding;
	}

	@Override
	public String toString() {
		switch (grinding) {
		case COARSE:
			return "Кофе грубого помола \"" + super.getName() + "\" " + super.getCaffeine() + "% - " + super.getPrice()
					+ "KZT";
		case MIDDLE_GROUND:
			return "Кофе среднего помола \"" + super.getName() + "\" " + super.getCaffeine() + "% - " + super.getPrice()
					+ "KZT";
		case FINE_GRINDING:
			return "Кофе тонкого помола \"" + super.getName() + "\" " + super.getCaffeine() + "% - " + super.getPrice()
					+ "KZT";
		case SUPERFINE_GRINDING:
			return "Кофе сверхтонкого помола \"" + super.getName() + "\" " + super.getCaffeine() + "% - " + super.getPrice()
					+ "KZT";
		default:
			return "Ошибка который быть не должно!";

		}
	}
}
