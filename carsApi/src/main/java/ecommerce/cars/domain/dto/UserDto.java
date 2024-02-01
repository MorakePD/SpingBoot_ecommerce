package ecommerce.cars.domain.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UserDto {

    private Long user_id;

    private String user_name;

    private String phone_number;

    private String surname;

    private String password;

    private String email;

}
