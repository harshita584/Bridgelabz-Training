package com.generics.mealplangenerator;

public class Meal<T extends MealPlan> {
	int calory;
	T category;
	
	public Meal(int calory, T category) {
		this.calory = calory;
		this.category = category;
	}
	
	public String toString() {
		return calory + " " + category.getCategory();
	}
	
	public int getCalories() {
		return calory;
	}
	
	public String category() {
		return category.getCategory();
	}
}
