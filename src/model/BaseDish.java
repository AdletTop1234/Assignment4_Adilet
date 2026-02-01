package model;

import service.interfaces.CalorieCalculable;
import service.interfaces.Validatable;

public abstract class BaseDish implements Validatable, CalorieCalculable {

    private int id;
    private String name;

    public BaseDish(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() { return id; }
    public String getName() { return name; }

    public void setName(String name) {
        this.name = name;
    }

    // abstract methods (обязательное требование)
    public abstract void validate();
    public abstract double calculateCalories();

    // concrete method
    public void printSummary() {
        System.out.println(id + " - " + name);
    }
}
