package com.predicate;

public class StrawBerry extends Fruit {

	private double price;
	
	public StrawBerry() {
	}
	
	public StrawBerry(String color, double weight, double price){
		super(color, weight);
		this.price = price;
	}

	@Override
	public String toString() {
		return "StrawBerry [color=" + super.getColor() + ", weight=" + super.getWeight() + "price=" + price + "]";
	}
	
	
}
