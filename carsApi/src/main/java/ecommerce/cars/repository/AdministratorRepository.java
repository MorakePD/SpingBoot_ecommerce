package ecommerce.cars.repository;

import ecommerce.cars.domain.entities.AdministratorEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AdministratorRepository extends CrudRepository<AdministratorEntity, Long> {
}
