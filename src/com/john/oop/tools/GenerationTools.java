package com.john.oop.tools;

import java.util.ArrayList;
import java.util.Random;

import com.john.oop.coffee.Coffee;
import com.john.oop.coffee.CoffeeBeans;
import com.john.oop.coffee.GroundCoffee;
import com.john.oop.coffee.GroundCoffee.Grinding;
import com.john.oop.packing.Packing;
import com.john.oop.packing.Packing.Material;

public class GenerationTools {

	private final int AMOUNT_OF_ONE_GRAM = 2;
	private final int AMOUNT_OF_ONE_GRAMM_PAPER = 1;
	private final int AMOUNT_OF_ONE_GRAMM_FOIL = 3;
	private final int AMOUNT_OF_ONE_GRAMM_GLASS = 4;

	private static ArrayList<String> nameCoffeeArray = new ArrayList<String>() {
		{
			add("Jacobs");
			add("Tchibo");
			add("Maxwell House");
			add("Jardin");
			add("Moccona");
			add("Nescafe");
		}
	};

	@SuppressWarnings("serial")
	private static ArrayList<Integer> capacityPaperPackaging = new ArrayList<Integer>() {
		{
			add(140);
			add(250);
			add(350);
			add(450);
		}
	};
	@SuppressWarnings("serial")
	private static ArrayList<Integer> weightPaperPackaging = new ArrayList<Integer>() {
		{
			add(20);
			add(35);
			add(45);
			add(65);
		}
	};
	@SuppressWarnings("serial")
	private static ArrayList<Integer> capacityFoilPackaging = new ArrayList<Integer>() {
		{
			add(250);
			add(350);
			add(450);
			add(700);
		}
	};
	@SuppressWarnings("serial")
	private static ArrayList<Integer> weightFoilPackaging = new ArrayList<Integer>() {
		{
			add(40);
			add(60);
			add(75);
			add(100);
		}
	};
	@SuppressWarnings("serial")
	private static ArrayList<Integer> capacityGlassPackaging = new ArrayList<Integer>() {
		{
			add(500);
			add(700);
			add(1000);
			add(1500);
			add(1700);
		}
	};
	@SuppressWarnings("serial")
	private static ArrayList<Integer> weightGlassPackaging = new ArrayList<Integer>() {
		{
			add(165);
			add(230);
			add(330);
			add(500);
			add(560);
		}
	};

	public static int getRandomInteger(int min, int max) {
		max -= min;
		return (int) (Math.random() * ++max) + min;
	}
	
	public static float getRandomFloat(float min, float max) {
		return  (float) (Math.random() * (max - min) + min);
	}
	
	public static Packing getRandomPacking() {
		Material material = null;
		int capacity = 0;// grams
		int weightOfPacking = 0; // grams

		switch (getRandomInteger(0, 2)) {
		case (0):
			material = Packing.Material.PAPER;
			capacity = capacityPaperPackaging.get(getRandomInteger(0, 3));
			weightOfPacking = weightPaperPackaging.get(getRandomInteger(0, 3));
			break;
		case (1):
			material = Packing.Material.FOIL;
			capacity = capacityFoilPackaging.get(getRandomInteger(0, 3));
			weightOfPacking = weightFoilPackaging.get(getRandomInteger(0, 3));
			break;
		case (2):
			material = Packing.Material.GLASS;
			capacity = capacityGlassPackaging.get(getRandomInteger(0, 4));
			weightOfPacking = weightGlassPackaging.get(getRandomInteger(0, 4));
			break;
		}

		return new Packing(material, capacity, weightOfPacking);
	}

	public static void showInfoPacking(ArrayList<Packing> array) {
		int paper140 = 0;
		int paper250 = 0;
		int paper350 = 0;
		int paper450 = 0;
		int foil250 = 0;
		int foil350 = 0;
		int foil450 = 0;
		int foil700 = 0;
		int glass500 = 0;
		int glass700 = 0;
		int glass1000 = 0;
		int glass1500 = 0;
		int glass1700 = 0;

		for (int i = 0; i < array.size(); i++) {
			switch (array.get(i).getMaterial()) {
			case PAPER:
				switch (array.get(i).getCapacity()) {
				case 140:
					paper140++;
					break;
				case 250:
					paper250++;
					break;
				case 350:
					paper350++;
					break;
				case 450:
					paper450++;
					break;
				}
				break;
			case FOIL:
				switch (array.get(i).getCapacity()) {
				case 250:
					foil250++;
					break;
				case 350:
					foil350++;
					break;
				case 450:
					foil450++;
					break;
				case 700:
					foil700++;
					break;
				}
				break;
			case GLASS:
				switch (array.get(i).getCapacity()) {
				case 500:
					glass500++;
					break;
				case 700:
					glass700++;
					break;
				case 1000:
					glass1000++;
					break;
				case 1500:
					glass1500++;
					break;
				case 1700:
					glass1700++;
					break;
				}
				break;
			}
		}
		System.out.println("Информация об упаковках:");
		System.out.println("Бумажная упаковка (объем - 140 г.; масса - 20): " + paper140 + " шт.");
		System.out.println("Бумажная упаковка (объем - 250 г.; масса - 35): " + paper250 + " шт.");
		System.out.println("Бумажная упаковка (объем - 350 г.; масса - 45): " + paper350 + " шт.");
		System.out.println("Бумажная упаковка (объем - 450 г.; масса - 65): " + paper450 + " шт.");

		System.out.println("Фольгированная упаковка (объем - 250 г.; масса - 40): " + foil250 + " шт.");
		System.out.println("Фольгированная упаковка (объем - 350 г.; масса - 60): " + foil350 + " шт.");
		System.out.println("Фольгированная упаковка (объем - 450 г.; масса - 75): " + foil450 + " шт.");
		System.out.println("Фольгированная упаковка (объем - 700 г.; масса - 100): " + foil700 + " шт.");

		System.out.println("Стеклянная тара (объем - 500 г.; масса - 165): " + glass500 + " шт.");
		System.out.println("Стеклянная тара (объем - 700 г.; масса - 230): " + glass700 + " шт.");
		System.out.println("Стеклянная тара (объем - 1000 г.; масса - 330): " + glass1000 + " шт.");
		System.out.println("Стеклянная тара (объем - 1500 г.; масса - 500): " + glass1500 + " шт.");
		System.out.println("Стеклянная тара (объем - 1700 г.; масса - 560): " + glass1700 + " шт.");
	}

	public static ArrayList<Packing> fillRandomCoffe(ArrayList<Packing> arrayPacking) {
		for (int i = 0; i < arrayPacking.size(); i++) {
			switch (getRandomInteger(0, 3)) {
			case 0:
				String name = nameCoffeeArray.get(getRandomInteger(0, 5));
				int caffeine = getRandomInteger(380, 650);
				int price = 0;
				arrayPacking.get(i).setCoffee(new CoffeeBeans(name,));
				break;
			case 1:

				break;
			case 2:

				break;
			}
		}
		return arrayPacking;
	}

	private float getCoefficient(String value) {
		switch (value) {
		case "Jacobs":
			return (float) 1;
		case "Tchibo":
			return (float) 1.1;
		case "Maxwell House":
			return (float) 1.2;
		case "Jardin":
			return (float) 1.3;
		case "Moccona":
			return (float) 1.4;
		case "Nescafe":
			return (float) 1.5;
		default:
			return -1;
		}
	}
}
