package ecommerce.cars.domain.entities;

import jakarta.persistence.*;
import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "administrators")
public class AdministratorEntity{

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "administrator_id_seq")
    private Long administrator_id;

    private String username;

    private String password;

}
