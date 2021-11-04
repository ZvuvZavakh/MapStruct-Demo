package zvuv.zavakh.mapstructdemo.dto;

import lombok.*;

import java.time.OffsetDateTime;
import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
public class CustomerDto {

    private UUID id;
    private String firstName;
    private String lastName;
    private String fullName;
    private OffsetDateTime birthDate;
}
