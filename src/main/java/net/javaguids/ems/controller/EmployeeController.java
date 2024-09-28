package net.javaguids.ems.controller;

import net.javaguids.ems.dto.EmployeeDto;
import net.javaguids.ems.entity.Employee;
import net.javaguids.ems.mapper.EmployeeMapper;
import net.javaguids.ems.service.impl.EmployeeServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/empolyees")
public class EmployeeController {

    @Autowired
    EmployeeServiceImpl employeeService;
    @PostMapping("/save")
    ResponseEntity<EmployeeDto> saveEmployees(@RequestBody EmployeeDto employeeDto)
    {
         EmployeeDto employeeDtoSaved= employeeService.createEmployee(employeeDto);
         return  new ResponseEntity<>(employeeDtoSaved,HttpStatus.CREATED);
    }

}
