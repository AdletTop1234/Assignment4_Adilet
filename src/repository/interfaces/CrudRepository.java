package repository.interfaces;

import java.util.List;
import java.util.Optional;

public interface CrudRepository<T> {

    void create(T entity);
    Optional<T> findById(int id);
    List<T> findAll();
    void update(T entity);
    void delete(int id);

    boolean existsById(int id);
}
