package com.john.oop.coffee;

public class InstantCoffee extends Coffee {
	public static enum ModeOfProduction {
		SUBLIMATED, SPRAY_DRYDEN, GRANULATED
	}

	private ModeOfProduction modeOfProduction = null;

	public InstantCoffee(String name, int price, int caffeine,
			ModeOfProduction modeOfProduction) {
		super.setName(name);
		super.setPrice(price);
		super.setCaffeine(caffeine);
		this.modeOfProduction = modeOfProduction;
	}

	public void setCaffeine(int caffeine) {
		if (caffeine >= 310 && caffeine <= 480) {
			super.setCaffeine(caffeine);
		}
	}

	@Override
	public String toString() {
		String rtnStr = "����������� ���� \"" + super.getName() + "\" ";
		switch (modeOfProduction) {
		case GRANULATED:
			rtnStr += "(���������������). ";
			break;
		case SPRAY_DRYDEN:
			rtnStr += "(�����-�����). ";
			break;
		case SUBLIMATED:
			rtnStr += "(���������������). ";
			break;
		}
		rtnStr += " " + super.getCaffeine() + " �� �������. ����: "
				+ super.getPrice() + " KZT.";
		return rtnStr;
	}
}
