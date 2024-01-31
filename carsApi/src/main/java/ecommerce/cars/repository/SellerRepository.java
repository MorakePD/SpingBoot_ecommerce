package ecommerce.cars.repository;

import ecommerce.cars.domain.entities.SellerEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SellerRepository extends CrudRepository<SellerEntity, Long> {
}
