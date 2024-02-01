package ecommerce.cars.repository;

import ecommerce.cars.domain.entities.UserEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<UserEntity, Long> {
    //<Optional>UserEntity findbyEmail(String email);

    Boolean existsByEmail(String email);

}
