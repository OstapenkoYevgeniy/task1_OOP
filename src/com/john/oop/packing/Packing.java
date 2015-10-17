package com.john.oop.packing;

import com.john.oop.coffee.Coffee;

public class Packing {
	public static enum Material {
		PAPER, FOIL, GLASS;
	}

	private Material material;
	private int capacity; // grams
	private int weightOfPacking; // grams
	private Coffee coffee = null;

	public Packing(Material material, int capacity, int weightOfPacking) {
		this.material = material;
		this.capacity = capacity;
		this.weightOfPacking = weightOfPacking;
	}

	public Material getMaterial() {
		return material;
	}

	public int getCapacity() {
		return capacity;
	}

	public int getWeightOfPacking() {
		return weightOfPacking;
	}

	public Coffee getCoffee() {
		return coffee;
	}

	public void setCoffee(Coffee coffee) {
		this.coffee = coffee;
	}

	@Override
	public String toString() {
		String rtnStr = "";
		switch (material) {
		case PAPER:
			rtnStr += "�������� ��������";
			break;
		case FOIL:
			rtnStr += "�������������� ��������";
			break;
		case GLASS:
			rtnStr += "���������� ��������";
			break;
		default:
			break;
		}
		rtnStr += "(����� - " + capacity + "�.;������ - "
				+ (weightOfPacking + capacity) + "�.). ";
		rtnStr += coffee.toString();
		return rtnStr;
	}

}
