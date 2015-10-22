package com.john.oop.сomparators;

import java.util.Comparator;
import com.john.oop.packing.Packing;

public class SortedByPriceToNetto implements Comparator<Packing> {
	@Override
	public int compare(Packing obj1, Packing obj2) {
		float priceObj1 = obj1.getCoffee().getPrice();
		float nettoObj1 = obj1.getCapacity();
		float ratioObj1 = priceObj1 / nettoObj1; // отношение цены к нетто

		float priceObj2 = obj2.getCoffee().getPrice();
		float nettoObj2 = obj2.getCapacity();
		float ratioObj2 = priceObj2 / nettoObj2; // отношение цены к нетто

		if (ratioObj1 > ratioObj2) {
			return 1;
		} else if (ratioObj1 < ratioObj2) {
			return -1;
		} else {
			return 0;
		}
	}
}
