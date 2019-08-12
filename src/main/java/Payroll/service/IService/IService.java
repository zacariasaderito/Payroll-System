package Payroll.service.IService;

public interface IService<TYPE, ID> {
    TYPE create(TYPE type);
    TYPE update(TYPE type);
    void delete(ID id);
    TYPE read(ID id);
}
