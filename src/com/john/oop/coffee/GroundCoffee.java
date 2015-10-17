package com.john.oop.coffee;

public class GroundCoffee extends Coffee {
	public static enum Grinding {
		COARSE, MIDDLE_GROUND, FINE_GRINDING, SUPERFINE_GRINDING
	}

	private Grinding grinding = null;

	public GroundCoffee(String name, int price, int caffeine, Grinding grinding) {
		super.setName(name);
		super.setPrice(price);
		super.setCaffeine(caffeine);
		this.grinding = grinding;
	}

	public void setCaffeine(int caffeine) {
		if (caffeine >= 380 && caffeine <= 650) {
			super.setCaffeine(caffeine);
		}
	}

	@Override
	public String toString() {
		String rtnStr = "������� ���� \"" + super.getName() + "\" ";
		switch (grinding) {
		case COARSE:
			rtnStr += "������� ������. ";
			break;
		case MIDDLE_GROUND:
			rtnStr += "�������� ������. ";
			break;
		case FINE_GRINDING:
			rtnStr += "������� ������. ";
			break;
		case SUPERFINE_GRINDING:
			rtnStr += "������������ ������. ";
			break;
		}
		rtnStr += " " + super.getCaffeine() + " �� �������. ����: " + super.getPrice() + " KZT.";
		return rtnStr;
	}
}
