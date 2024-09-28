package net.javaguids.ems.dto;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class EmployeeDto  {
    private Long id;
    private String firstName;
    private String lastName;
    private String emailId;
}
