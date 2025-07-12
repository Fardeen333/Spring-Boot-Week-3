package com.example.codingshuttle.jpatutorial.jpatuts.services;

import com.example.codingshuttle.jpatutorial.jpatuts.entities.DepartmentEntity;
import com.example.codingshuttle.jpatutorial.jpatuts.entities.EmployeeEntity;
import com.example.codingshuttle.jpatutorial.jpatuts.repositories.EmployeeRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class EmployeeService {

    private final EmployeeRepository employeeRepository;

    public EmployeeService(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    public EmployeeEntity createNewEmployee(EmployeeEntity employeeEntity){
        return employeeRepository.save(employeeEntity);
    }

    public EmployeeEntity getEmployeeById(Long id){
        return employeeRepository.findById(id).orElse(null);
    }


}
