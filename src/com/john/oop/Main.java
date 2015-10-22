package com.john.oop;

import java.util.ArrayList;
import java.util.List;

import com.john.oop.coffee.CoffeeBeans.SizeCoffeeBeans;
import com.john.oop.coffee.GroundCoffee.Grinding;
import com.john.oop.coffee.InstantCoffee.ModeOfProduction;
import com.john.oop.packing.Packing;
import com.john.oop.packing.Packing.Material;
import com.john.oop.search.Search;
import com.john.oop.search.SearchBuilder;
import com.john.oop.tools.GenerationTools;
import com.john.oop.tools.InformationTools;
import com.john.oop.сomparators.SortedByPriceToBrutto;

public class Main {
	public static void main(String[] args) {
		List<Packing> arrayPacking = fillListPacking(50);
		InformationTools.showInfoPacking(arrayPacking);

		arrayPacking = GenerationTools.fillRandomCoffe(arrayPacking);
		arrayPacking.sort(new SortedByPriceToBrutto());
		//InformationTools.showInfoPackingOfCoffee(arrayPacking);

		Search searchQuery = new SearchBuilder()
//				.searchInGrinding(Grinding.SUPERFINE_GRINDING)
//				.searchInSizeCoffeeBeans(SizeCoffeeBeans.SIEVE_12)
//				.searchInModeOfProduction(ModeOfProduction.SUBLIMATED)
//				.searchInPriceMore(2000)
//				.searchInPriceLess(3000)
//				.searchInCaffeineMore(600)
//				.searchInCaffeineLess(800)
				.searchInMaterial(Material.GLASS)
				//.searchInName("Jacobs")
				.build();

		List<Packing> resultSearch = searchQuery.find(arrayPacking);
		InformationTools.showInfoPackingOfCoffee(resultSearch);
	}

	private static List<Packing> fillListPacking(int count) {
		List<Packing> arrayPacking = new ArrayList<Packing>();
		for (int counter = 0; counter < count; counter++) {
			arrayPacking.add(GenerationTools.getRandomPacking());
		}
		return arrayPacking;
	}

}
