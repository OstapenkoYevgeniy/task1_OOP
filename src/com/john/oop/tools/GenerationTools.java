package com.john.oop.tools;

import java.util.ArrayList;
import java.util.List;

import com.john.oop.coffee.CoffeeBeans;
import com.john.oop.coffee.CoffeeBeans.SizeCoffeeBeans;
import com.john.oop.coffee.GroundCoffee;
import com.john.oop.coffee.GroundCoffee.Grinding;
import com.john.oop.coffee.InstantCoffee;
import com.john.oop.coffee.InstantCoffee.ModeOfProduction;
import com.john.oop.packing.Packing;
import com.john.oop.packing.Packing.Material;

public abstract class GenerationTools {

	private final static int AMOUNT_OF_ONE_GRAM = 2;

	private static List<String> arrayCoffeeName = new ArrayList<String>() {
		{
			add("Jacobs");
			add("Tchibo");
			add("Maxwell House");
			add("Jardin");
			add("Moccona");
			add("Nescafe");
		}
	};

	private static List<Integer> arrayCapacityPaperPackaging = new ArrayList<Integer>() {
		{
			add(140);
			add(250);
			add(350);
			add(450);
		}
	};

	private static List<Integer> arrayWeightPaperPackaging = new ArrayList<Integer>() {
		{
			add(20);
			add(35);
			add(45);
			add(65);
		}
	};

	private static List<Integer> arrayCapacityFoilPackaging = new ArrayList<Integer>() {
		{
			add(250);
			add(350);
			add(450);
			add(700);
		}
	};

	private static List<Integer> arrayWeightFoilPackaging = new ArrayList<Integer>() {
		{
			add(40);
			add(60);
			add(75);
			add(100);
		}
	};

	private static List<Integer> arrayCapacityGlassPackaging = new ArrayList<Integer>() {
		{
			add(500);
			add(700);
			add(1000);
			add(1500);
			add(1700);
		}
	};

	private static List<Integer> arrayWeightGlassPackaging = new ArrayList<Integer>() {
		{
			add(165);
			add(230);
			add(330);
			add(500);
			add(560);
		}
	};

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

	public static List<Packing> fillRandomCoffe(List<Packing> arrayPacking) {
		String name = null;
		SizeCoffeeBeans sizeCoffeeBeans = null;
		Grinding grinding = null;
		ModeOfProduction modeOfProduction = null;
		int price = 0;
		int caffeine = 0;

		for (int i = 0; i < arrayPacking.size(); i++) {
			name = null;
			sizeCoffeeBeans = null;
			grinding = null;
			modeOfProduction = null;
			price = 0;
			caffeine = 0;

			switch (getRandomInteger(0, 2)) {
			case 0:
				name = arrayCoffeeName.get(getRandomInteger(0, 5));
				caffeine = getRandomInteger(380, 650);
				sizeCoffeeBeans = getRandomSizeCoffeeBeans();
				price = arrayPacking.get(i).getCapacity() * AMOUNT_OF_ONE_GRAM;
				price += arrayPacking.get(i).getWeightOfPacking()
						* getAmountOfOneGrammPacking(arrayPacking.get(i).getMaterial());
				price += price * getCoefficientSizeCoffeeBeans(sizeCoffeeBeans);

				arrayPacking.get(i).setCoffee(new CoffeeBeans(name, price, caffeine, sizeCoffeeBeans));
				break;
			case 1:
				name = arrayCoffeeName.get(getRandomInteger(0, 5));
				caffeine = getRandomInteger(380, 650);
				grinding = getRandomGroundCoffee();
				price = arrayPacking.get(i).getCapacity() * AMOUNT_OF_ONE_GRAM;
				price += arrayPacking.get(i).getWeightOfPacking()
						* getAmountOfOneGrammPacking(arrayPacking.get(i).getMaterial());
				price += price * getCoefficientGrinding(grinding);

				arrayPacking.get(i).setCoffee(new GroundCoffee(name, price, caffeine, grinding));
				break;
			case 2:
				name = arrayCoffeeName.get(getRandomInteger(0, 5));
				caffeine = getRandomInteger(310, 480);
				modeOfProduction = getRandomModeOfProduktion();
				price = arrayPacking.get(i).getCapacity() * AMOUNT_OF_ONE_GRAM;
				price += arrayPacking.get(i).getWeightOfPacking()
						* getAmountOfOneGrammPacking(arrayPacking.get(i).getMaterial());
				price += price * getCoefficientModeOfProduction(modeOfProduction);

				arrayPacking.get(i).setCoffee(new InstantCoffee(name, price, caffeine, modeOfProduction));
				break;
			}

		}
		return arrayPacking;
	}

	private static int getRandomInteger(int min, int max) {
		return min + (int) (Math.random() * (max + 1));
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
			throw new RuntimeException("Invalid value");
		}
	}

	private static float getCoefficientSizeCoffeeBeans(SizeCoffeeBeans sizeCoffeeBeans) {
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
			throw new RuntimeException("Invalid value");
		}
	}

	private static float getCoefficientModeOfProduction(ModeOfProduction modeOfProduction) {
		switch (modeOfProduction) {
		case SPRAY_DRYDEN:
			return 1.1F;
		case GRANULATED:
			return 1.2F;
		case SUBLIMATED:
			return 1.3F;
		default:
			throw new RuntimeException("Invalid value");
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
			throw new RuntimeException("Invalid value");
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
			throw new RuntimeException("Invalid data");
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
			throw new RuntimeException("Invalid value");
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
			throw new RuntimeException("Invalid value");
		}
	}
}
