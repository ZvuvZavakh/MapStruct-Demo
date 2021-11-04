package zvuv.zavakh.mapstructdemo.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import zvuv.zavakh.mapstructdemo.dto.CustomerDto;
import zvuv.zavakh.mapstructdemo.entity.Customer;
import zvuv.zavakh.mapstructdemo.mapper.CustomerMapper;

import java.sql.Timestamp;
import java.util.UUID;

@Component
public class MappingDemo implements CommandLineRunner {

    private final CustomerMapper customerMapper;

    @Autowired
    public MappingDemo(CustomerMapper customerMapper) {
        this.customerMapper = customerMapper;
    }

    @Override
    public void run(String... args) throws Exception {
        Customer customer = Customer
                .builder()
                .id(UUID.randomUUID())
                .firstName("Dude")
                .lastName("Dudeson")
                .birthDate(Timestamp.valueOf("2021-11-04 18:07:21.979344"))
                .build();

        System.out.println(customer);

        CustomerDto customerDto = customerMapper.convertEntityToDto(customer);

        System.out.println(customerDto);
    }
}
