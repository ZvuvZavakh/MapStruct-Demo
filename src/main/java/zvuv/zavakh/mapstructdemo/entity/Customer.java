package zvuv.zavakh.mapstructdemo.entity;

import lombok.*;

import java.sql.Timestamp;
import java.util.UUID;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
public class Customer {

    private UUID id;
    private String firstName;
    private String lastName;
    private Timestamp birthDate;
}
