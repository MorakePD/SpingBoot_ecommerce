package ecommerce.cars;

import ecommerce.cars.domain.entities.UserEntity;

public final class TestDataUtil {
    public TestDataUtil(){}
    public static UserEntity createTestUserEntity() {
        return UserEntity.builder()
                .user_id(1L)
                .user_name("Dean")
                .surname("Nkosana")
                .email("deannkosana@gmail.com")
                .password("1234")
                .phone_number("0678134523")
                .build();
    }
}
