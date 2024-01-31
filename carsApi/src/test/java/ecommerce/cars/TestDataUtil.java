package ecommerce.cars;

import ecommerce.cars.domain.entities.CustomerEntity;

public final class TestDataUtil {
    public TestDataUtil(){}
    public static CustomerEntity createTestCustomerEntity() {
        return CustomerEntity.builder()
                .customer_id(1L)
                .customer_name("Dean")
                .surname("Nkosana")
                .email("deannkosana@gmail.com")
                .password("1234")
                .phone_number("0678134523")
                .build();
    }
}
