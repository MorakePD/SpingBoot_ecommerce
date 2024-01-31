package ecommerce.cars.services;

import ecommerce.cars.domain.entities.CustomerEntity;

public interface CustomerService {
    CustomerEntity save(CustomerEntity customerEntity);
}
