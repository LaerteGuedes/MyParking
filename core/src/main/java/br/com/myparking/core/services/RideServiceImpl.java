package br.com.myparking.core.services;

import br.com.myparking.core.model.Ride;
import br.com.myparking.core.repositories.RideRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by laerteguedes on 21/09/17.
 */
@Service
@Transactional
public class RideServiceImpl extends BaseServiceImpl<Ride> implements RideService {

    @Autowired
    private RideRepository repo;

    @Override
    public JpaRepository getRepository() {
        return repo;
    }
}
