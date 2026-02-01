package controller;

import model.*;
import service.interfaces.DishService;

import java.util.List;

public class DishController {

    private final DishService service;

    public DishController(DishService service) {
        this.service = service;
    }

    public void createDish(BaseDish dish) {
        service.create(dish);
    }

    public void showAllDishes() {
        List<BaseDish> dishes = service.getAll();
        dishes.forEach(BaseDish::printSummary);
    }

    public void showDish(int id) {
        BaseDish dish = service.getById(id);
        dish.printSummary();
    }

    public void deleteDish(int id) {
        service.delete(id);
    }
}
