package com.example.spring.controller;

import com.example.spring.entity.Employee;
import com.example.spring.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmpController {
    @Autowired
    private EmpService empService;
@PostMapping("emp")
    public Employee save(@RequestBody Employee employee){

    return empService.save(employee);
    }
@GetMapping("emp1")
    public List<Employee> findAll(){

    return empService.findAll();
    }

@GetMapping("getbyId/{id}")
    public Employee getById(@PathVariable Long id){
    return empService.getbyId(id);
}

    @PutMapping("update/{id}")
    public Employee updateEmp(@RequestBody Employee employee){

    return empService.update(employee);
    }

    @DeleteMapping("delete/{id}")
    public void deleteEmp(@PathVariable Long id){
    empService.deleteEmp(id);
    }

}




