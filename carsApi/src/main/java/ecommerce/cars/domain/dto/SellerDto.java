package ecommerce.cars.domain.dto;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SellerDto {

    private Long seller_id;

    private String seller_name;

    private String phone_number;

    private String surname;

    private String password;

    private String email;
}
