package br.com.riscozero.core.services;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Created by laerteguedes on 02/09/17.
 */
public abstract class BaseServiceImpl<T> implements BaseService<T, Long> {

    public abstract JpaRepository getRepository();

    @Override
    public List<T> findAll() {
        return getRepository().findAll();
    }

    @Override
    public void save(T t) {
        getRepository().save(t);
    }

    @Override
    public void delete(Long id) {
        getRepository().delete(id);
    }

    @Override
    public T find(Long id) {
        return (T) getRepository().findOne(id);
    }
}
