package model;

public class Ingredient {

    private String name;
    private double calories;
    private double quantity;

    public Ingredient(String name, double calories, double quantity) {
        this.name = name;
        this.calories = calories;
        this.quantity = quantity;
    }

    public String getName() { return name; }
    public double getCalories() { return calories; }
    public double getQuantity() { return quantity; }
}
