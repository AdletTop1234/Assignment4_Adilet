package service.interfaces;

import model.BaseDish;
import java.util.List;

public interface DishService {

    void create(BaseDish dish);
    BaseDish getById(int id);
    List<BaseDish> getAll();
    void update(BaseDish dish);
    void delete(int id);
}