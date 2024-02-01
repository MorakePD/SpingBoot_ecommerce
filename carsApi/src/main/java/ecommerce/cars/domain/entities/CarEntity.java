package ecommerce.cars.domain.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "cars")
public class CarEntity {

    @Id
    private String vin_number;

    private String model;

    private String colour;

    private Boolean isUsed;

    private String description;

    private Boolean availability;

    private Double price;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "user_id")
    private UserEntity sellerEntity;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "brand_id")
    private BrandEntity brandEntity;
}
