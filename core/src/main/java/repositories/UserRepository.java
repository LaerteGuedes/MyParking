package repositories;

import model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by laerteguedes on 26/08/17.
 */
@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
