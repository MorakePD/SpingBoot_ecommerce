package ecommerce.cars.repositories;

import ecommerce.cars.TestDataUtil;
import ecommerce.cars.domain.entities.CustomerEntity;
import ecommerce.cars.repository.CustomerRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
@ExtendWith(SpringExtension.class)
@DirtiesContext(classMode = DirtiesContext.ClassMode.AFTER_EACH_TEST_METHOD)
public class CustomerEntityRepositoryIntegrationTests {

    private CustomerRepository underTest;

    @Autowired
    public CustomerEntityRepositoryIntegrationTests(CustomerRepository underTest){
        this.underTest = underTest;
    }

    @Test
    public void testThatCustomerCanBeCreatedAndRecalled(){
        CustomerEntity customerEntity = TestDataUtil.createTestCustomerEntity();
        underTest.save(customerEntity);
        Optional<CustomerEntity> result = underTest.findById(customerEntity.getCustomer_id());
        assertThat(result).isPresent();
        assertThat(result.get()).isEqualTo(customerEntity);
    }

}
