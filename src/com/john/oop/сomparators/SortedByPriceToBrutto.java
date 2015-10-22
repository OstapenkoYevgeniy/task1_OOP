package com.john.oop.сomparators;

import java.util.Comparator;
import com.john.oop.packing.Packing;

public class SortedByPriceToBrutto implements Comparator<Packing> {
	@Override
	public int compare(Packing obj1, Packing obj2) {
		float priceObj1 = obj1.getCoffee().getPrice();
		float bruttoObj1 = obj1.getWeightOfPacking() + obj1.getCapacity();
		float ratioObj1 = priceObj1 / bruttoObj1; // отношение цены к брутто
		
		float priceObj2 = obj2.getCoffee().getPrice();
		float bruttoObj2 = obj2.getWeightOfPacking() + obj2.getCapacity();
		float ratioObj2 = priceObj2 / bruttoObj2; // отношение цены к брутто

		if (ratioObj1 > ratioObj2) {
			return 1;
		} else if (ratioObj1 < ratioObj2) {
			return -1;
		} else {
			return 0;
		}
	}
}
