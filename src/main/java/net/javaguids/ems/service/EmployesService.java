package net.javaguids.ems.service;

import net.javaguids.ems.dto.EmployeeDto;
import org.springframework.stereotype.Service;


public interface EmployesService {

    EmployeeDto createEmployee(EmployeeDto employeeDto);
}
