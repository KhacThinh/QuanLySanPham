package model.repository;

import java.util.List;

public interface NameObjectRepository<E> {

    public List<E> findAllByObject();

    public boolean save(E e);

    public void update(E e);

    public boolean delete(Object o);

    public E findById(Object o);
}
