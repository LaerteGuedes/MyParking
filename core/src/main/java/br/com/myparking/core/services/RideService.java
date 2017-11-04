package br.com.myparking.core.services;

import br.com.myparking.core.model.Ride;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by laerteguedes on 21/09/17.
 */
public interface RideService extends BaseService<Ride, Long> {
}
