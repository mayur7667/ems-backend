package net.javaguids.ems.service.impl;

import net.javaguids.ems.dto.EmployeeDto;
import net.javaguids.ems.entity.Employee;
import net.javaguids.ems.mapper.EmployeeMapper;
import net.javaguids.ems.repository.EmployeeRepository;
import net.javaguids.ems.service.EmployesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImpl implements EmployesService {

    @Autowired
    EmployeeRepository employeeRepository;
    @Override
    public EmployeeDto createEmployee(EmployeeDto employeeDto) {

        Employee employee = EmployeeMapper.mapToEmployee(employeeDto);

      Employee save=  employeeRepository.save(employee);
      EmployeeDto savedEmployee = EmployeeMapper.mapToEmployeeDto(save);
        return savedEmployee;
    }
}
