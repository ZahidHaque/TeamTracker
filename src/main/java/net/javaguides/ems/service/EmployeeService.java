package net.javaguides.ems.service;

import net.javaguides.ems.dto.EmployeeDto;

import java.util.List;

public interface EmployeeService {
    EmployeeDto createEmployee(EmployeeDto emDto);

    EmployeeDto getEmployeebyId(long employeeId);

    List<EmployeeDto> getAllEmployee();

    EmployeeDto updateEmployee(long employeeId, EmployeeDto updatedEmployee);
}
