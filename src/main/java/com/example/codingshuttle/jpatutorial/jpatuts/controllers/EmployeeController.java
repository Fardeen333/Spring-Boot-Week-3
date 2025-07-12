package com.example.codingshuttle.jpatutorial.jpatuts.controllers;

import com.example.codingshuttle.jpatutorial.jpatuts.entities.DepartmentEntity;
import com.example.codingshuttle.jpatutorial.jpatuts.entities.EmployeeEntity;
import com.example.codingshuttle.jpatutorial.jpatuts.services.EmployeeService;
import org.springframework.web.bind.annotation.*;

@RestController()
@RequestMapping(path = "/employee")
public class EmployeeController {

    private final EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @PostMapping
    public EmployeeEntity createNewEmployee(@RequestBody EmployeeEntity employeeEntity){
        return employeeService.createNewEmployee(employeeEntity);
    }

    @GetMapping("/{employeeId}")
    public EmployeeEntity getEmployeeById(@PathVariable Long employeeId){
        return employeeService.getEmployeeById(employeeId);
    }


}
