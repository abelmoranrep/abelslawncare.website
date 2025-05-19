package com.abelslawncare.website.Repositories;

import com.abelslawncare.website.Models.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
