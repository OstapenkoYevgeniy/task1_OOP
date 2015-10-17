package com.john.oop.packing;

import com.john.oop.coffee.Coffee;

public class Packing {
	public static enum Material {
		PAPER, FOIL, GLASS;
	}

	private Material material;
	private int capacity; // grams
	private int weightOfPacking; // grams
	private int price;
	private Coffee coffee = null;
	
	public Packing(Material material, int capacity, int weightOfPacking) {
		this.material = material;
		this.capacity = capacity;
		this.weightOfPacking = weightOfPacking;
	}

	private final void manufacturePackaging() {

	}

	public Coffee getCoffee() {
		return coffee;
	}
	
	public Material getMaterial() {
		return material;
	}
	
	public int getCapacity() {
		return capacity;
	}
	
	public void setCoffee(Coffee coffee) {
		this.coffee = coffee;
	}

	@Override
	public String toString() {
		return material + " - " + capacity + " - " + weightOfPacking;
	}
	
	
}
