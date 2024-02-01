package ecommerce.cars.services;

import ecommerce.cars.domain.entities.UserEntity;

public interface UserService {
    UserEntity save(UserEntity userEntity);

    Boolean existsByEmail(String email);
}
