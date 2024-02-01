package ecommerce.cars.controllers;

import ecommerce.cars.domain.dto.UserDto;
import ecommerce.cars.domain.entities.UserEntity;
import ecommerce.cars.mappers.Mapper;
import ecommerce.cars.services.UserService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("api/auth")
public class UserController {
    private UserService userService;

    private Mapper<UserEntity, UserDto> customerMapper;

    public UserController(UserService userService, Mapper<UserEntity, UserDto> customerMapper) {
        this.userService = userService;
        this.customerMapper = customerMapper;
    }

    @PostMapping(path = "/users/save")
    public ResponseEntity<?> registerUser(@RequestBody UserDto userDto){
        if (userService.existsByEmail(userDto.getEmail())) {
            return new ResponseEntity<>("Email is already taken!", HttpStatus.BAD_REQUEST);
        }

        UserEntity userEntity = customerMapper.mapFrom(userDto);
        UserEntity savedUserEntity = userService.save(userEntity);
        return new ResponseEntity<>(customerMapper.mapTo(savedUserEntity), HttpStatus.CREATED);
    }
}
