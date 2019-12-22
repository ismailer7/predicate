package com.predicate;

public class Apple extends Fruit {

	public Apple() {
		super();
	}

	public Apple(String color, double weight) {
		super(color, weight);
	}

	@Override
	public String toString() {
		return "Apple [color=" + super.getColor() + ", weight=" + super.getWeight() + "]";
	}
	
	
}
