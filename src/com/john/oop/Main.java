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
		// Создаем упаковки кофе для сортировки и заполняем их
		List<Packing> packingsForSorting = fillListPacking(20);
		InformationTools.showInfoPacking(packingsForSorting);
		
		packingsForSorting = GenerationTools.fillRandomCoffe(packingsForSorting);
		InformationTools.showInfoPackingOfCoffee(packingsForSorting);
		
		packingsForSorting.sort(new SortedByPriceToBrutto());
		InformationTools.showInfoPackingOfCoffee(packingsForSorting);
		
		// Создаем упаковки кофе для поиска и заполняем их
		List<Packing> packingsForSearch = fillListPacking(10_000);
		packingsForSearch = GenerationTools.fillRandomCoffe(packingsForSearch);

		Search searchQuery = new SearchBuilder()
				.searchInGrinding(Grinding.SUPERFINE_GRINDING)
				.searchInSizeCoffeeBeans(SizeCoffeeBeans.SIEVE_12)
				.searchInModeOfProduction(ModeOfProduction.SUBLIMATED)
				.searchInPriceLess(9000)
				.searchInCaffeineMore(500)
				.searchInMaterial(Material.GLASS)
				.searchInBruttoMore(1000)
				.searchInName("Jacobs")
				.build();

		List<Packing> resultSearch = searchQuery.find(packingsForSearch);
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
