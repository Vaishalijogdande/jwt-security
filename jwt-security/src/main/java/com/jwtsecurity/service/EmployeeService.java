package com.jwtsecurity.service;

import com.jwtsecurity.entity.Employee;
import com.jwtsecurity.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    public Optional<Employee> getEmployee(Integer id){
        return employeeRepository.findById(id);
    }

    public Employee addEmployee(Employee employee){
        return employeeRepository.save(employee);
    }

    public String deleteEmployee(Integer id){

        employeeRepository.deleteById(id);
        return "Deleted";
    }

    public List<Employee> getAllEmployees(){
        return employeeRepository.findAll();
    }




}
