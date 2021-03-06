package br.com.myparking.core.services;

import br.com.myparking.core.model.Model;

import java.util.List;

/**
 * Created by laerteguedes on 02/09/17.
 */
public interface BaseService<T extends Model, Long> {

    List<T> findAll();
    T find(Long id);
    void insert(T t);
    void update(T t);
    void delete(Long id);

}
