package com.predicate;

public class AppleRedColorPredicate implements Predicate<Fruit> {

	@Override
	public boolean check(Fruit fruit) {
		return fruit.getColor().equals("red") && fruit.getClass() == Apple.class  ? true : false; 
	}

}
