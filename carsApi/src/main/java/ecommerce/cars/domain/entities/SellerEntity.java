package ecommerce.cars.domain.entities;

import jakarta.persistence.*;
import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "sellers")
public class SellerEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seller_id_seq")
    private Long seller_id;

    private String seller_name;

    private String phone_number;

    private String surname;

    private String password;

    private String email;
}
