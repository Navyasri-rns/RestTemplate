package com.example.spring.service;

import com.example.spring.entity.Employee;
import com.example.spring.repository.EmpRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Service
public class EmpService {
    @Autowired
    private EmpRepo empRepo;

    public Employee save(Employee employee){
        return empRepo.save(employee);
    }

    public List<Employee> findAll(){
        return empRepo.findAll();
    }

    public Employee getbyId(Long id){
        return empRepo.findById(id).get();
    }

    public Employee update(Employee employee){
        Employee emp = empRepo.findById(employee.getId()).get();
        emp.setId(employee.getId());
        emp.setFirstName(employee.getFirstName());
        emp.setLastName(employee.getLastName());
        emp.setEmailId(employee.getEmailId());
        return empRepo.save(employee);
    }

    public void deleteEmp(@PathVariable Long id){
        empRepo.deleteById(id);
    }
}
