package ecommerce.cars.repository;

import ecommerce.cars.domain.entities.CarEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CarRepository extends CrudRepository<CarEntity, String> {
}
