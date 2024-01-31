package ecommerce.cars.domain.dto;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CustomerDto {

    private Long customer_id;

    private String customer_name;

    private String phone_number;

    private String surname;

    private String password;

    private String email;

}
