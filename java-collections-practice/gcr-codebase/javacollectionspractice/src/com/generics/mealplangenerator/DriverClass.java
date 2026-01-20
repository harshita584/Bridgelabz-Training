package com.generics.mealplangenerator;

public class DriverClass {
	public static void main(String[] args) {
		Meal<VegetarianMeal> meal1 = new Meal<>(100, new VegetarianMeal());
		System.out.println(meal1.getCalories());
		System.out.println(meal1);
		
		Meal<HighProteinMeal> meal2 = new Meal<>(150, new HighProteinMeal());
		System.out.println(meal2);
	}
}
