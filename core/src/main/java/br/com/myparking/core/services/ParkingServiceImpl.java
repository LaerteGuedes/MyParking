package br.com.myparking.core.services;

import br.com.myparking.core.model.Parking;
import br.com.myparking.core.repositories.ParkingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by laerteguedes on 21/09/17.
 */

@Service
@Transactional
public class ParkingServiceImpl extends BaseServiceImpl<Parking> implements ParkingService {

    @Autowired
    private ParkingRepository repo;

    @Override
    public JpaRepository getRepository() {
        return repo;
    }
}
