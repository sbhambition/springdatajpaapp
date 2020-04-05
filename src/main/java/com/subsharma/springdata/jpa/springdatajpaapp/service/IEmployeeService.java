package com.subsharma.springdata.jpa.springdatajpaapp.service;

import com.subsharma.springdata.jpa.springdatajpaapp.entity.Employee;

import java.util.List;
import java.util.Optional;

public interface IEmployeeService {

    List<Employee> findAll();

    Optional<Employee> findEmployeeById(int id);

    void save(Employee employee);

    void deleteById(int id);

}
