package br.com.myparking.core.services;

import br.com.myparking.core.model.Vacancy;
import br.com.myparking.core.repositories.VacancyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by laerteguedes on 21/09/17.
 */
@Service
@Transactional
public class VacancyServiceImpl extends BaseServiceImpl<Vacancy> implements VacancyService {

    @Autowired
    private VacancyRepository repo;

    @Override
    public JpaRepository getRepository() {
        return repo;
    }
}
