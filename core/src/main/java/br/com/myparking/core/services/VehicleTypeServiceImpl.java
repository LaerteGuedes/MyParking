package br.com.myparking.core.services;

import br.com.myparking.core.model.VehicleType;
import br.com.myparking.core.repositories.VehicleTypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by laerteguedes on 21/09/17.
 */
@Service
@Transactional
public class VehicleTypeServiceImpl extends BaseServiceImpl<VehicleType> implements VehicleTypeService {

    @Autowired
    private VehicleTypeRepository repo;

    @Override
    public JpaRepository getRepository() {
        return repo;
    }
}
