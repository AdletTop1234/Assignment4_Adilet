package repository;

import model.BaseDish;
import repository.interfaces.CrudRepository;
import exception.DatabaseOperationException;

import java.util.*;

public class DishRepository implements CrudRepository<BaseDish> {

    private final Map<Integer, BaseDish> storage = new HashMap<>();
    // (в реальном проекте здесь JDBC)

    @Override
    public void create(BaseDish dish) {
        storage.put(dish.getId(), dish);
    }

    @Override
    public Optional<BaseDish> findById(int id) {
        return Optional.ofNullable(storage.get(id));
    }

    @Override
    public List<BaseDish> findAll() {
        return new ArrayList<>(storage.values());
    }

    @Override
    public void update(BaseDish dish) {
        storage.put(dish.getId(), dish);
    }

    @Override
    public void delete(int id) {
        storage.remove(id);
    }

    @Override
    public boolean existsById(int id) {
        return storage.containsKey(id);
    }
}
