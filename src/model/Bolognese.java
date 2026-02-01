package model;

import java.util.List;

public class Bolognese extends SecondCourse {

    public Bolognese(int id, String name, List<Ingredient> ingredients) {
        super(id, name, ingredients);
    }

    @Override
    public void validate() {
        if (ingredients == null || ingredients.isEmpty())
            throw new IllegalArgumentException("Ingredients empty");
    }

    @Override
    public double calculateCalories() {
        return ingredients.stream()
                .mapToDouble(i -> i.getCalories() * i.getQuantity())
                .sum();
    }
}
