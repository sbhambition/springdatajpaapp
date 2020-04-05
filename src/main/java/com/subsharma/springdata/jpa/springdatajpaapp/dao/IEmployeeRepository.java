package com.subsharma.springdata.jpa.springdatajpaapp.dao;

import com.subsharma.springdata.jpa.springdatajpaapp.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IEmployeeRepository extends JpaRepository<Employee, Integer> {
}
