package ecommerce.cars.domain.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class BrandDto {

    private Long brand_id;

    private String brand_name;

    private String country_origin;
}
