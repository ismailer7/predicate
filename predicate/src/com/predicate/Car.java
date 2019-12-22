package com.predicate;

public class Car {

	private String color;
	
	private int year;
	
	public Car() {
	}
	
	public Car(String color, int year) {
		this.color = color;
		this.year = year;
	}

	public String getColor() {
		return color;
	}

	public int getYear() {
		return year;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public void setYear(int year) {
		this.year = year;
	}

	@Override
	public String toString() {
		return "Car [color=" + color + ", year=" + year + "]";
	}
	
}
