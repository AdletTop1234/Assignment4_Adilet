package model;

import java.util.List;

public abstract class SecondCourse extends BaseDish {

    protected List<Ingredient> ingredients;

    public SecondCourse(int id, String name, List<Ingredient> ingredients) {
        super(id, name);
        this.ingredients = ingredients;
    }

    public List<Ingredient> getIngredients() {
        return ingredients;
    }
}

