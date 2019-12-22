package com.predicate;

public class AppleHeavyWeightPredicate implements Predicate<Fruit> {

	@Override
	public boolean check(Fruit fruit) {
		return fruit.getWeight() > 150 && fruit.getClass() == Apple.class ? true : false;
	}

}
