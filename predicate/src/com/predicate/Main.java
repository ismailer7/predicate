package com.predicate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
	public static void main(String[] args) {

		// The farmer has a collection of apples
		// and wants to filter them by different criteria

		List<Fruit> inventory = Arrays.asList(new Apple("green", 120), new Apple("red", 250), new Apple("yellow", 180),
				new StrawBerry("red", 10, 120), new StrawBerry("black", 12, 200));

		System.out.println("Red Apples");
		List<Fruit> redApples = fruitFilter(inventory, new AppleRedColorPredicate());
		for (Fruit apple : redApples) {
			System.out.println(apple);
		}
		System.out.println("Heavy apples");
		List<Fruit> heavyApples = fruitFilter(inventory, new AppleHeavyWeightPredicate());
		for (Fruit apple : heavyApples) {
			System.out.println(apple);
		}
		System.out.println("Yellow apples");
		List<Fruit> yellowApples = fruitFilter(inventory, new AppleYellowColorPredicate());
		for (Fruit apple : yellowApples) {
			System.out.println(apple);
		}

		// we can use anonymous classes for this predicate

		List<Fruit> greenApples = fruitFilter(inventory, new Predicate<Fruit>() {
			@Override
			public boolean check(Fruit fruit) {
				return fruit.getColor().equals("green") && fruit.getClass() == Apple.class ? true : false;
			}
		});

		// using lambda expression

		greenApples = fruitFilter(inventory,
				(Fruit fruit) -> fruit.getColor().equals("green") && fruit.getClass() == Apple.class ? true : false);
		System.out.println("Green Apples");
		for (Fruit fruit : greenApples) {
			System.out.println(fruit);
		}
		// what if the inventory contains oranges or bananas or even vegetables or
		// something else or any other fruits wow we need to abstract over the type of
		// list.
		// let add abstraction over apple (Fruit)

		List<Fruit> blackStrawBerries = fruitFilter(inventory, new Predicate<Fruit>() {
			@Override
			public boolean check(Fruit fruit) {
				return fruit.getClass() == StrawBerry.class && fruit.getColor().equals("black") ? true : false;
			}
		});
		System.out.println("black straw berries");
		for (Fruit fruit : blackStrawBerries) {
			System.out.println(fruit);
		}

		//////////////////////////////////////////////

		List<Car> garage = Arrays.asList(new Car("red", 2005), new Car("yellow", 2012), new Car("black", 2019));
		
		List<Car> recentCars = carFilter(garage, (Car car) -> car.getYear() >= 2010 ? true : false);
		System.out.println("Recent cars in market");
		for (Car car : recentCars) {
			System.out.println(car);
		}
	}

	public static List<Fruit> fruitFilter(List<Fruit> inventory, Predicate<Fruit> predicate) {
		List<Fruit> fruits = new ArrayList<>();
		for (Fruit fruit : inventory) {
			if (predicate.check(fruit))
				fruits.add(fruit);
		}
		return fruits;
	}

	// we can add another filter let say car filter

	public static List<Car> carFilter(List<Car> garage, Predicate<Car> predicate) {
		List<Car> cars = new ArrayList<>();
		for (Car car : garage) {
			if (predicate.check(car))
				cars.add(car);
		}
		return cars;
	}

}
