package ecommerce.cars.services.impl;

import ecommerce.cars.domain.entities.CustomerEntity;
import ecommerce.cars.repository.CustomerRepository;
import ecommerce.cars.services.CustomerService;
import org.springframework.stereotype.Service;

@Service
public class CustomerServiceImpl implements CustomerService {

    private CustomerRepository customerRepository;

    public CustomerServiceImpl(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    @Override
    public CustomerEntity save(CustomerEntity customerEntity) {
        return customerRepository.save(customerEntity);
    }
}
