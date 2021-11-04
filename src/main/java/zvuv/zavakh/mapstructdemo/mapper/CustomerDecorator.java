package zvuv.zavakh.mapstructdemo.mapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import zvuv.zavakh.mapstructdemo.dto.CustomerDto;
import zvuv.zavakh.mapstructdemo.entity.Customer;

public abstract class CustomerDecorator implements CustomerMapper {

    @Autowired
    @Qualifier("delegate")
    private CustomerMapper delegate;

    @Override
    public CustomerDto convertEntityToDto(Customer customer) {
        CustomerDto customerDto = delegate.convertEntityToDto(customer);
        String fullName = String.format("%s %s", customer.getFirstName(), customer.getLastName());

        customerDto.setFullName(fullName);

        return customerDto;
    }
}
