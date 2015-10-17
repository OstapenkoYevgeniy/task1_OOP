package com.john.oop.tools;

import java.util.ArrayList;

import com.john.oop.coffee.CoffeeBeans;
import com.john.oop.coffee.CoffeeBeans.SizeCoffeeBeans;
import com.john.oop.coffee.GroundCoffee;
import com.john.oop.coffee.GroundCoffee.Grinding;
import com.john.oop.coffee.InstantCoffee;
import com.john.oop.coffee.InstantCoffee.ModeOfProduction;
import com.john.oop.packing.Packing;
import com.john.oop.packing.Packing.Material;

public class GenerationTools {

	private final static int AMOUNT_OF_ONE_GRAM = 2;

	@SuppressWarnings("serial")
	private static ArrayList<String> arrayCoffeeName = new ArrayList<String>() {
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
	private static ArrayList<Integer> arrayCapacityPaperPackaging = new ArrayList<Integer>() {
		{
			add(140);
			add(250);
			add(350);
			add(450);
		}
	};
	@SuppressWarnings("serial")
	private static ArrayList<Integer> arrayWeightPaperPackaging = new ArrayList<Integer>() {
		{
			add(20);
			add(35);
			add(45);
			add(65);
		}
	};
	@SuppressWarnings("serial")
	private static ArrayList<Integer> arrayCapacityFoilPackaging = new ArrayList<Integer>() {
		{
			add(250);
			add(350);
			add(450);
			add(700);
		}
	};
	@SuppressWarnings("serial")
	private static ArrayList<Integer> arrayWeightFoilPackaging = new ArrayList<Integer>() {
		{
			add(40);
			add(60);
			add(75);
			add(100);
		}
	};
	@SuppressWarnings("serial")
	private static ArrayList<Integer> arrayCapacityGlassPackaging = new ArrayList<Integer>() {
		{
			add(500);
			add(700);
			add(1000);
			add(1500);
			add(1700);
		}
	};
	@SuppressWarnings("serial")
	private static ArrayList<Integer> arrayWeightGlassPackaging = new ArrayList<Integer>() {
		{
			add(165);
			add(230);
			add(330);
			add(500);
			add(560);
		}
	};

	public static int getRandomInteger(int min, int max) {
		return min + (int)(Math.random()*max);
	}

	public static Packing getRandomPacking() {
		Material material = null;
		int capacity = 0;// grams
		int weightOfPacking = 0; // grams

		switch (getRandomInteger(0, 2)) {
		case (0):
			material = Packing.Material.PAPER;
			capacity = arrayCapacityPaperPackaging.get(getRandomInteger(0, 3));
			weightOfPacking = arrayWeightPaperPackaging.get(getRandomInteger(0, 3));
			break;
		case (1):
			material = Packing.Material.FOIL;
			capacity = arrayCapacityFoilPackaging.get(getRandomInteger(0, 3));
			weightOfPacking = arrayWeightFoilPackaging.get(getRandomInteger(0, 3));
			break;
		case (2):
			material = Packing.Material.GLASS;
			capacity = arrayCapacityGlassPackaging.get(getRandomInteger(0, 4));
			weightOfPacking = arrayWeightGlassPackaging.get(getRandomInteger(0, 4));
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
		System.out.println("Бумажная упаковка (объем - 140 г.; масса - 20): "
				+ paper140 + " шт.");
		System.out.println("Бумажная упаковка (объем - 250 г.; масса - 35): "
				+ paper250 + " шт.");
		System.out.println("Бумажная упаковка (объем - 350 г.; масса - 45): "
				+ paper350 + " шт.");
		System.out.println("Бумажная упаковка (объем - 450 г.; масса - 65): "
				+ paper450 + " шт.");

		System.out
				.println("Фольгированная упаковка (объем - 250 г.; масса - 40): "
						+ foil250 + " шт.");
		System.out
				.println("Фольгированная упаковка (объем - 350 г.; масса - 60): "
						+ foil350 + " шт.");
		System.out
				.println("Фольгированная упаковка (объем - 450 г.; масса - 75): "
						+ foil450 + " шт.");
		System.out
				.println("Фольгированная упаковка (объем - 700 г.; масса - 100): "
						+ foil700 + " шт.");

		System.out.println("Стеклянная тара (объем - 500 г.; масса - 165): "
				+ glass500 + " шт.");
		System.out.println("Стеклянная тара (объем - 700 г.; масса - 230): "
				+ glass700 + " шт.");
		System.out.println("Стеклянная тара (объем - 1000 г.; масса - 330): "
				+ glass1000 + " шт.");
		System.out.println("Стеклянная тара (объем - 1500 г.; масса - 500): "
				+ glass1500 + " шт.");
		System.out.println("Стеклянная тара (объем - 1700 г.; масса - 560): "
				+ glass1700 + " шт.");
	}

	public static ArrayList<Packing> fillRandomCoffe(
			ArrayList<Packing> arrayPacking) {
		String name = null;
		int caffeine = 0;
		SizeCoffeeBeans sizeCoffeeBeans = null;
		Grinding grinding = null;
		ModeOfProduction modeOfProduction = null;
		int price = 0;
		for (int i = 0; i < arrayPacking.size(); i++) {
			name = null;
			caffeine = 0;
			sizeCoffeeBeans = null;
			grinding = null;
			modeOfProduction = null;
			price = 0;
			switch (getRandomInteger(0, 2)) {
			case 0:
				name = arrayCoffeeName.get(getRandomInteger(0, 5));
				caffeine = getRandomInteger(380, 650);
				sizeCoffeeBeans = getRandomSizeCoffeeBeans();
				price = arrayPacking.get(i).getCapacity() * AMOUNT_OF_ONE_GRAM;
				price += arrayPacking.get(i).getWeightOfPacking()
						* getAmountOfOneGrammPacking(arrayPacking.get(i)
								.getMaterial());
				price += price * getCoefficientSizeCoffeeBeans(sizeCoffeeBeans);
				arrayPacking.get(i)
						.setCoffee(
								new CoffeeBeans(name, price, caffeine,
										sizeCoffeeBeans));
				break;
			case 1:
				name = arrayCoffeeName.get(getRandomInteger(0, 5));
				caffeine = getRandomInteger(380, 650);
				grinding = getRandomGroundCoffee();
				price = arrayPacking.get(i).getCapacity() * AMOUNT_OF_ONE_GRAM;
				price += arrayPacking.get(i).getWeightOfPacking()
						* getAmountOfOneGrammPacking(arrayPacking.get(i)
								.getMaterial());
				price += price * getCoefficientGrinding(grinding);
				arrayPacking.get(i).setCoffee(
						new GroundCoffee(name, price, caffeine, grinding));
				break;
			case 2:
				name = arrayCoffeeName.get(getRandomInteger(0, 5));
				caffeine = getRandomInteger(310, 480);
				modeOfProduction = getRandomModeOfProduktion();
				price = arrayPacking.get(i).getCapacity() * AMOUNT_OF_ONE_GRAM;
				price += arrayPacking.get(i).getWeightOfPacking()
						* getAmountOfOneGrammPacking(arrayPacking.get(i)
								.getMaterial());
				price += price
						* getCoefficientModeOfProduction(modeOfProduction);
				arrayPacking.get(i).setCoffee(
						new InstantCoffee(name, price, caffeine,
								modeOfProduction));
				break;
			}

		}
		return arrayPacking;
	}

	private static ModeOfProduction getRandomModeOfProduktion() {
		switch (getRandomInteger(0, 2)) {
		case 0:
			return ModeOfProduction.SUBLIMATED;
		case 1:
			return ModeOfProduction.SPRAY_DRYDEN;
		case 2:
			return ModeOfProduction.GRANULATED;
		default:
			return null;
		}
	}

	private static float getCoefficientModeOfProduction(
			ModeOfProduction modeOfProduction) {
		switch (modeOfProduction) {
		case SPRAY_DRYDEN:
			return 1.1F;
		case GRANULATED:
			return 1.2F;
		case SUBLIMATED:
			return 1.3F;
		default:
			return 0;
		}
	}

	private static float getCoefficientGrinding(Grinding grinding) {
		switch (grinding) {
		case COARSE:
			return 1.1F;
		case MIDDLE_GROUND:
			return 1.2F;
		case FINE_GRINDING:
			return 1.2F;
		case SUPERFINE_GRINDING:
			return 1.3F;
		default:
			return 0;
		}
	}

	private static float getCoefficientSizeCoffeeBeans(
			SizeCoffeeBeans sizeCoffeeBeans) {
		switch (sizeCoffeeBeans) {
		case SIEVE_12:
			return 1.1F;
		case SIEVE_13:
			return 1.2F;
		case SIEVE_14:
			return 1.3F;
		case SIEVE_15:
			return 1.4F;
		case SIEVE_16:
			return 1.5F;
		case SIEVE_17:
			return 1.6F;
		case SIEVE_18:
			return 1.7F;
		case SIEVE_19:
			return 1.8F;
		case SIEVE_20:
			return 1.9F;
		default:
			return 0;
		}
	}

	private static int getAmountOfOneGrammPacking(Material material) {
		switch (material) {
		case PAPER:
			return 1;
		case FOIL:
			return 3;
		case GLASS:
			return 4;
		default:
			return 0;
		}
	}

	public static void showInfoPackingOfCoffee(ArrayList<Packing> arrayPacking) {
		for (int i = 0; i < arrayPacking.size(); i++) {
			System.out.println(arrayPacking.get(i).toString());
		}
	}

	private static Grinding getRandomGroundCoffee() {
		switch (getRandomInteger(0, 3)) {
		case 0:
			return Grinding.COARSE;
		case 1:
			return Grinding.MIDDLE_GROUND;
		case 2:
			return Grinding.FINE_GRINDING;
		case 3:
			return Grinding.SUPERFINE_GRINDING;
		default:
			return null;
		}
	}

	private static SizeCoffeeBeans getRandomSizeCoffeeBeans() {
		switch (getRandomInteger(0, 8)) {
		case 0:
			return CoffeeBeans.SizeCoffeeBeans.SIEVE_12;
		case 1:
			return CoffeeBeans.SizeCoffeeBeans.SIEVE_13;
		case 2:
			return CoffeeBeans.SizeCoffeeBeans.SIEVE_14;
		case 3:
			return CoffeeBeans.SizeCoffeeBeans.SIEVE_15;
		case 4:
			return CoffeeBeans.SizeCoffeeBeans.SIEVE_16;
		case 5:
			return CoffeeBeans.SizeCoffeeBeans.SIEVE_17;
		case 6:
			return CoffeeBeans.SizeCoffeeBeans.SIEVE_18;
		case 7:
			return CoffeeBeans.SizeCoffeeBeans.SIEVE_19;
		case 8:
			return CoffeeBeans.SizeCoffeeBeans.SIEVE_20;
		default:
			return null;
		}
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
