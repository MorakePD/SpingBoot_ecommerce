package ecommerce.cars.domain.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class OrderDto {

    private Long order_id;

    private Date order_date;

    private UserDto userDto;

    private CarDto carDto;
}
