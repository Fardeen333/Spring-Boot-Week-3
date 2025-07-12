package com.example.codingshuttle.jpatutorial.jpatuts.repositories;

import com.example.codingshuttle.jpatutorial.jpatuts.entities.EmployeeEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<EmployeeEntity, Long> {

}
