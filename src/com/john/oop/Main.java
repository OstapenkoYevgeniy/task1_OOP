package com.john.oop;

import java.util.ArrayList;
import java.util.Random;

import com.john.oop.packing.Packing;
import com.john.oop.tools.GenerationTools;

public class Main {
	public static void main(String[] args) {
		ArrayList<Packing> arrayPacking = new ArrayList<Packing>();

		for (int counter = 0; counter < GenerationTools.getRandomInteger(5, 15); counter++) {
			arrayPacking.add(GenerationTools.getRandomPacking());
		}

		GenerationTools.showInfoPacking(arrayPacking);
		
		for (int i = 0; i < 20; i++) {
			System.out.println(GenerationTools.getRandomFloat(2.3F,2.5F));
		}
//		arrayPacking = GenerationTools.fillRandomCoffe(arrayPacking);
	}

}
