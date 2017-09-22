package br.com.myparking.core.services;

import br.com.myparking.core.model.Vehicle;
import br.com.myparking.core.repositories.VehicleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by laerteguedes on 21/09/17.
 */
@Service
@Transactional
public class VehicleServiceImpl extends BaseServiceImpl<Vehicle> implements VehicleService {

    @Autowired
    private VehicleRepository repo;

    @Override
    public JpaRepository getRepository() {
        return repo;
    }
}
