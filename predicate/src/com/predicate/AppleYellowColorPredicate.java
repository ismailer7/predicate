package com.predicate;

public class AppleYellowColorPredicate implements Predicate<Fruit> {

	@Override
	public boolean check(Fruit fruit) {
		return fruit.getColor().equals("yellow") && fruit.getClass() == Apple.class ? true : false;
	}

}
