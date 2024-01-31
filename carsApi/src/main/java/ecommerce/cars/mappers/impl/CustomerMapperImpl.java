package ecommerce.cars.mappers.impl;

import ecommerce.cars.domain.dto.CustomerDto;
import ecommerce.cars.domain.entities.CustomerEntity;
import ecommerce.cars.mappers.Mapper;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
public class CustomerMapperImpl implements Mapper<CustomerEntity, CustomerDto> {

    private ModelMapper modelMapper;

    public CustomerMapperImpl(ModelMapper modelMapper) {
        this.modelMapper = modelMapper;
    }

    @Override
    public CustomerDto mapTo(CustomerEntity customerEntity) {
        return modelMapper.map(customerEntity, CustomerDto.class);
    }

    @Override
    public CustomerEntity mapFrom(CustomerDto customerDto) {
        return modelMapper.map(customerDto, CustomerEntity.class);
    }
}
