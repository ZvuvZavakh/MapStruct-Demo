package zvuv.zavakh.mapstructdemo.mapper;

import org.mapstruct.DecoratedWith;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import zvuv.zavakh.mapstructdemo.dto.CustomerDto;
import zvuv.zavakh.mapstructdemo.entity.Customer;

@Mapper(uses = {DateMapper.class}, componentModel = "spring")
@DecoratedWith(CustomerDecorator.class)
public interface CustomerMapper {

    CustomerMapper INSTANCE = Mappers.getMapper(CustomerMapper.class);

    Customer convertDtoToEntity(CustomerDto customerDto);
    CustomerDto convertEntityToDto(Customer customer);
}
