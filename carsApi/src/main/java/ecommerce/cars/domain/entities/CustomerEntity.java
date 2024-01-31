package ecommerce.cars.domain.entities;

import jakarta.persistence.*;
import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Builder
@Table(name = "customers")
public class CustomerEntity{
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "customer_id_seq")
    private Long customer_id;

    private String customer_name;

    private String phone_number;

    private String surname;

    private String password;

    private String email;

}