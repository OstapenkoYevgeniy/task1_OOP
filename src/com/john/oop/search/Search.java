package com.john.oop.search;

import java.util.ArrayList;
import java.util.List;

import com.john.oop.coffee.GroundCoffee;
import com.john.oop.coffee.CoffeeBeans;
import com.john.oop.coffee.CoffeeBeans.SizeCoffeeBeans;
import com.john.oop.coffee.GroundCoffee.Grinding;
import com.john.oop.coffee.InstantCoffee;
import com.john.oop.coffee.InstantCoffee.ModeOfProduction;
import com.john.oop.packing.Packing;
import com.john.oop.packing.Packing.Material;

public class Search {
	private Grinding grinding;
	private SizeCoffeeBeans sizeCoffeeBeans;
	private ModeOfProduction modeOfProduction;
	private Material material;
	private String name;
	private int priceMore;
	private int priceLess;
	private int caffeineMore;
	private int caffeineLess;
	private int nettoMore;
	private int nettoLess;
	private int bruttoMore;
	private int bruttoLess;

	public void setGrinding(Grinding grinding) {
		this.grinding = grinding;
	}

	public void setSizeCoffeeBeans(SizeCoffeeBeans sizeCoffeeBeans) {
		this.sizeCoffeeBeans = sizeCoffeeBeans;
	}

	public void setModeOfProduction(ModeOfProduction modeOfProduction) {
		this.modeOfProduction = modeOfProduction;
	}

	public void setMaterial(Material material) {
		this.material = material;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setPriceMore(int priceMore) {
		this.priceMore = priceMore;
	}

	public void setPriceLess(int priceLess) {
		this.priceLess = priceLess;
	}

	public void setCaffeineMore(int caffeineMore) {
		this.caffeineMore = caffeineMore;
	}

	public void setCaffeineLess(int caffeineLess) {
		this.caffeineLess = caffeineLess;
	}

	public void setNettoMore(int capacityMore) {
		this.nettoMore = capacityMore;
	}

	public void setNettoLess(int capacityLess) {
		this.nettoLess = capacityLess;
	}

	public void setBruttoMore(int bruttoMore) {
		this.bruttoMore = bruttoMore;
	}

	public void setBruttoLess(int bruttoLess) {
		this.bruttoLess = bruttoLess;
	}

	public List<Packing> find(List<Packing> packings) {
		List<Packing> result = new ArrayList<Packing>();

		for (Packing packing : packings) {
			boolean isGrinding = false;
			boolean isSizeCoffeeBeans = false;
			boolean isModeOfProduction = false;
			boolean isMaterial = false;
			boolean isName = false;

			boolean isPrice = false;
			boolean isPriceMore = false;
			boolean isPriceLess = false;

			boolean isCaffeine = false;
			boolean isCaffeineMore = false;
			boolean isCaffeineLess = false;

			boolean isNetto = false;
			boolean isNettoMore = false;
			boolean isNettoLess = false;

			boolean isBrutto = false;
			boolean isBruttoMore = false;
			boolean isBruttoLess = false;

			if (grinding != null) {
				if (packing.getCoffee().getClass() == GroundCoffee.class) {
					GroundCoffee groundCoffee = (GroundCoffee) packing.getCoffee();
					isGrinding = groundCoffee.getGrinding() == grinding;
				}
			}
			if (sizeCoffeeBeans != null) {
				if (packing.getCoffee().getClass() == CoffeeBeans.class) {
					CoffeeBeans coffeeBeans = (CoffeeBeans) packing.getCoffee();
					isSizeCoffeeBeans = coffeeBeans.getSizeCoffeeBeans() == sizeCoffeeBeans;
				}
			}
			if (modeOfProduction != null) {
				if (packing.getCoffee().getClass() == InstantCoffee.class) {
					InstantCoffee instantCoffee = (InstantCoffee) packing.getCoffee();
					isModeOfProduction = instantCoffee.getModeOfProduction() == modeOfProduction;
				}
			}
			if (grinding == null && sizeCoffeeBeans == null && modeOfProduction == null) {
				isGrinding = true;
				isSizeCoffeeBeans = true;
				isModeOfProduction = true;
			}

			if (material != null) {
				isMaterial = packing.getMaterial() == material;
			} else {
				isMaterial = true;
			}

			if (name != null) {
				isName = packing.getCoffee().getName().equals(name);
			} else {
				isName = true;
			}
			// Условие поиска по цене
			if (priceMore != -1) {
				isPriceMore = packing.getCoffee().getPrice() >= priceMore;
			}
			if (priceLess != -1) {
				isPriceLess = packing.getCoffee().getPrice() <= priceLess;
			}
			if (priceMore != -1 && priceLess != -1) {
				isPrice = isPriceMore && isPriceLess;
			} else if (priceMore != -1) {
				isPrice = isPriceMore;
			} else if (priceLess != -1) {
				isPrice = isPriceLess;
			} else if (priceMore == -1 && priceLess == -1) {
				isPrice = true;
			}
			// Условие поиска по содержанию кофеина
			if (caffeineMore != -1) {
				isCaffeineMore = packing.getCoffee().getCaffeine() >= caffeineMore;
			}
			if (caffeineLess != -1) {
				isCaffeineLess = packing.getCoffee().getCaffeine() <= caffeineLess;
			}
			if (caffeineMore != -1 && caffeineLess != -1) {
				isCaffeine = isCaffeineMore && isCaffeineLess;
			} else if (caffeineMore != -1) {
				isCaffeine = isCaffeineMore;
			} else if (caffeineLess != -1) {
				isCaffeine = isCaffeineLess;
			} else if (caffeineMore == -1 && caffeineLess == -1) {
				isCaffeine = true;
			}
			// Условие поиска по весу нетто
			if (nettoMore != -1) {
				isNettoMore = packing.getCapacity() >= nettoMore;
			}
			if (nettoLess != -1) {
				isNettoLess = packing.getCapacity() <= nettoLess;
			}
			if (nettoMore != -1 && nettoLess != -1) {
				isNetto = isNettoMore && isNettoLess;
			} else if (nettoMore != -1) {
				isNetto = isNettoMore;
			} else if (nettoLess != -1) {
				isNetto = isNettoLess;
			} else if (nettoMore == -1 && nettoLess == -1) {
				isNetto = true;
			}
			// Условие поиска по весу брутто
			if (bruttoMore != -1) {
				isBruttoMore = (packing.getCapacity() + packing.getWeightOfPacking()) >= bruttoMore;
			}
			if (bruttoLess != -1) {
				isBruttoLess = (packing.getCapacity() + packing.getWeightOfPacking()) <= bruttoLess;
			}
			if (bruttoMore != -1 && bruttoLess != -1) {
				isBrutto = isBruttoMore && isBruttoLess;
			} else if (bruttoMore != -1) {
				isBrutto = isBruttoMore;
			} else if (bruttoLess != -1) {
				isBrutto = isBruttoLess;
			} else if (bruttoMore == -1 && bruttoLess == -1) {
				isBrutto = true;
			}

			// Проверка на соответствие
			if ((isGrinding || isSizeCoffeeBeans || isModeOfProduction) && isName && isPrice && isCaffeine && isMaterial
					&& isNetto && isBrutto) {
				result.add(packing);
			}
		}
		return result;
	}
}
