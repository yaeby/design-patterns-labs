package repository;

import java.util.List;

public interface IRepository<T, ID> {
    List<T> findAll();
    T findById(ID id);
    void add(T entity);
    void update(T entity);
    void delete(ID id);
    T findByName(String name);
    int getTotalCount();
}
