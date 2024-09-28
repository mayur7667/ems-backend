package net.javaguids.ems.mapper;

import net.javaguids.ems.dto.EmployeeDto;
import net.javaguids.ems.entity.Employee;

public class EmployeeMapper {

    public static EmployeeDto mapToEmployeeDto(Employee employee)
    {

        return new EmployeeDto().builder()
                .firstName(employee.getFirstName())
                .lastName(employee.getLastName())
                .emailId(employee.getEmailId())
                .id(employee.getId())
                .build();
    }
public static  Employee mapToEmployee(EmployeeDto employeeDto)
{
    return new Employee().builder()
            .firstName(employeeDto.getFirstName())
            .lastName(employeeDto.getLastName())
            .emailId(employeeDto.getEmailId())
            .id(employeeDto.getId())
            .build();
}
}
