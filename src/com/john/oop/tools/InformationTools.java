package com.john.oop.tools;

import java.util.List;

import com.john.oop.packing.Packing;

public abstract class InformationTools {
	public static void showInfoPackingOfCoffee(List<Packing> arrayPacking) {
		for (int i = 0; i < arrayPacking.size(); i++) {
			System.out.println(arrayPacking.get(i).toString());
		}
		System.out.println("------------------------------------------");
	}

	public static void showInfoPacking(List<Packing> array) {
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
		System.out.println("------------------------------------------");
	}
}
