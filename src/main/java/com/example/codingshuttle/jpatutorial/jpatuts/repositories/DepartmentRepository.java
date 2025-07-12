package com.example.codingshuttle.jpatutorial.jpatuts.repositories;

import com.example.codingshuttle.jpatutorial.jpatuts.entities.DepartmentEntity;
import com.example.codingshuttle.jpatutorial.jpatuts.entities.EmployeeEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartmentRepository extends JpaRepository<DepartmentEntity, Long> {
    DepartmentEntity findByManager(EmployeeEntity employeeEntity);
}
