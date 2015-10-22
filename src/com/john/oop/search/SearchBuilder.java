package com.john.oop.search;

import com.john.oop.coffee.CoffeeBeans.SizeCoffeeBeans;
import com.john.oop.coffee.GroundCoffee.Grinding;
import com.john.oop.coffee.InstantCoffee.ModeOfProduction;
import com.john.oop.packing.Packing.Material;

public class SearchBuilder {
	private Grinding grinding;
	private SizeCoffeeBeans sizeCoffeeBeans;
	private ModeOfProduction modeOfProduction;
	private Material material;
	private String name;
	private int priceMore = -1;
	private int priceLess = -1;
	private int caffeineMore = -1;
	private int caffeineLess = -1;
	
	public SearchBuilder searchInGrinding (Grinding grinding) {
		this.grinding = grinding;
		return this;
	}
	
	public SearchBuilder searchInSizeCoffeeBeans (SizeCoffeeBeans sizeCoffeeBeans) {
		this.sizeCoffeeBeans = sizeCoffeeBeans;
		return this;
	}
	
	public SearchBuilder searchInModeOfProduction (ModeOfProduction modeOfProduction) {
		this.modeOfProduction = modeOfProduction;
		return this;
	}
	
	public SearchBuilder searchInMaterial (Material material) {
		this.material = material;
		return this;
	}
	
	public SearchBuilder searchInName (String name) {
		this.name = name;
		return this;
	}
	
	public SearchBuilder searchInPriceMore (int priceMore) {
		this.priceMore = priceMore;
		return this;
	}
	
	public SearchBuilder searchInPriceLess (int priceLess) {
		this.priceLess = priceLess;
		return this;
	}
	
	public SearchBuilder searchInCaffeineMore (int caffeineMore) {
		this.caffeineMore = caffeineMore;
		return this;
	}
	
	public SearchBuilder searchInCaffeineLess (int caffeineLess) {
		this.caffeineLess = caffeineLess;
		return this;
	}
	public Search build() {
		Search search = new Search();
		search.setGrinding(grinding);
		search.setSizeCoffeeBeans(sizeCoffeeBeans);
		search.setModeOfProduction(modeOfProduction);
		search.setName(name);
		search.setPriceMore(priceMore);
		search.setPriceLess(priceLess);
		search.setCaffeineMore(caffeineMore);
		search.setCaffeineLess(caffeineLess);
		search.setMaterial(material);
		return search;
	}
}
