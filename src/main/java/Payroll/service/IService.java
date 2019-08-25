package Payroll.service;

import java.util.Set;

public interface IService<T, ID> {

    T create(T t);
    T update(T t);
    T read(ID id);
    void delete(ID id);
    Set<T> getAll();
}
