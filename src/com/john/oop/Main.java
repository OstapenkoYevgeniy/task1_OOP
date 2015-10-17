package com.john.oop;

import java.util.ArrayList;

import com.john.oop.packing.Packing;
import com.john.oop.tools.GenerationTools;

public class Main {
	public static void main(String[] args) {
		ArrayList<Packing> arrayPacking = new ArrayList<Packing>();

		for (int counter = 0; counter < GenerationTools.getRandomInteger(150,
				350); counter++) {
			arrayPacking.add(GenerationTools.getRandomPacking());
		}

		GenerationTools.showInfoPacking(arrayPacking);
		System.out.println("-------------------------------------------------");

		arrayPacking = GenerationTools.fillRandomCoffe(arrayPacking);
		GenerationTools.showInfoPackingOfCoffee(arrayPacking);
		System.out.println("-------------------------------------------------");
	}

}
