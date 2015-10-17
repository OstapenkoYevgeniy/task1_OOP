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
			rtnStr += "Бумажная упаковка";
			break;
		case FOIL:
			rtnStr += "Фольгированная упаковка";
			break;
		case GLASS:
			rtnStr += "Стеклянная упаковка";
			break;
		default:
			break;
		}
		rtnStr += "(Нетто - " + capacity + "г.;Брутто - "
				+ (weightOfPacking + capacity) + "г.). ";
		rtnStr += coffee.toString();
		return rtnStr;
	}

}
