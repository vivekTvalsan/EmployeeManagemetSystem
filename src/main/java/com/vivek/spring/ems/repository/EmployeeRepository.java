package com.vivek.spring.ems.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.vivek.spring.ems.model.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
