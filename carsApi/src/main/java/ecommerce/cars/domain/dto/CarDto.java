package ecommerce.cars.domain.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CarDto {

    private String vin_number;

    private String model;

    private String colour;

    private Boolean isUsed;

    private String description;

    private Boolean availability;

    private Double price;

    private SellerDto sellerDto;

    private BrandDto brandDto;
}
