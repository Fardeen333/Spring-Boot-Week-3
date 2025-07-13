package com.example.codingshuttle.jpatutorial.jpatuts.controllers;

import com.example.codingshuttle.jpatutorial.jpatuts.entities.DepartmentEntity;
import com.example.codingshuttle.jpatutorial.jpatuts.services.DepartmentService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/deaprtment")
public class DepartmentController {

    private final DepartmentService departmentService;

    public DepartmentController(DepartmentService departmentService) {
        this.departmentService = departmentService;
    }

    @PostMapping
    public DepartmentEntity createNewDepartment(@RequestBody DepartmentEntity departmentEntity){
        return departmentService.createNewDepartment(departmentEntity);
    }

    @GetMapping("/{departmentId}")
    public DepartmentEntity getDepartmentById(@PathVariable Long departmentId){
        return departmentService.getDepartmentById(departmentId);
    }

    @PutMapping("/{departmentId}/manager/{employeeId}")
    public DepartmentEntity assignManagerToDepartment(@PathVariable Long departmentId, @PathVariable Long employeeId){
        return departmentService.assignManagerToDepartment(departmentId, employeeId);
    }

    @GetMapping("/assigned-department/{employeeId}")
    public DepartmentEntity getAssignedDepartmentOfManager(@PathVariable Long employeeId){
        return departmentService.getAssignedDepartmentOfManager(employeeId);
    }

    @PutMapping("/{departmentId}/worker/{employeeId}")
    public DepartmentEntity assignWorkerToDepartment(@PathVariable Long departmentId, @PathVariable Long employeeId){
        return departmentService.assignWorkerToDepartment(departmentId, employeeId);
    }

    @PutMapping("/{departmentId}/freelancer/{employeeId}")
    public DepartmentEntity assignFreelancerToDepartment(@PathVariable Long departmentId, @PathVariable Long employeeId){
        return departmentService.assignFreelancerToDepartment(departmentId, employeeId);
    }
}
