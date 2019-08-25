package Payroll.repository;

import java.util.Set;

public interface IRepository<T, ID> {

    T create(T t);
    T update(T t);
    T read(ID id);
    void delete(ID id);
    Set<T> getAll();
}
