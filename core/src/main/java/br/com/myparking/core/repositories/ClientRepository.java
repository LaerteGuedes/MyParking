package br.com.myparking.core.repositories;

import br.com.myparking.core.model.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by laerteguedes on 21/09/17.
 */
@Repository
public interface ClientRepository extends JpaRepository<Client, Long> {
}
