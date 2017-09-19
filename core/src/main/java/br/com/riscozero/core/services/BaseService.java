package br.com.riscozero.core.services;

import java.util.List;

/**
 * Created by laerteguedes on 02/09/17.
 */
public interface BaseService<T, Long> {

    List<T> findAll();
    T find(Long id);
    void save(T t);
    void delete(Long id);

}
