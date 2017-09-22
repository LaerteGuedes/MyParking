package br.com.myparking.core.services;

import br.com.myparking.core.model.Client;
import br.com.myparking.core.repositories.ClientRepository;
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
public class ClientServiceImpl extends BaseServiceImpl<Client> implements ClientService {

    @Autowired
    private ClientRepository repo;

    @Override
    public JpaRepository getRepository() {
        return repo;
    }
}
