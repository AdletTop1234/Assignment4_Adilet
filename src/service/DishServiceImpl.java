package service;

import model.BaseDish;
import repository.interfaces.CrudRepository;
import service.interfaces.DishService;
import exception.*;

import java.util.Comparator;
import java.util.List;

public class DishServiceImpl implements DishService {

    private final CrudRepository<BaseDish> repository;

    // DIP — внедрение через конструктор
    public DishServiceImpl(CrudRepository<BaseDish> repository) {
        this.repository = repository;
    }

    @Override
    public void create(BaseDish dish) {
        if (dish == null)
            throw new InvalidInputException("Dish is null");

        dish.validate();

        if (repository.existsById(dish.getId()))
            throw new DuplicateResourceException("Dish already exists");

        repository.create(dish);
    }

    @Override
    public BaseDish getById(int id) {
        return repository.findById(id)
                .orElseThrow(() ->
                        new ResourceNotFoundException("Dish not found"));
    }

    @Override
    public List<BaseDish> getAll() {
        List<BaseDish> dishes = repository.findAll();

        // lambda + sorting
        dishes.sort(Comparator.comparing(BaseDish::getName));

        return dishes;
    }

    @Override
    public void update(BaseDish dish) {
        dish.validate();

        if (!repository.existsById(dish.getId()))
            throw new ResourceNotFoundException("Dish not found");

        repository.update(dish);
    }

    @Override
    public void delete(int id) {
        if (!repository.existsById(id))
            throw new ResourceNotFoundException("Dish not found");

        repository.delete(id);
    }
}
