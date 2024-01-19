package com.example.spring.controller;

import com.example.spring.entity.Employee;
import com.example.spring.service.RestUtilService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("restUtil")
public class RestUtilController {
    @Autowired
    private RestUtilService restUtilService;

    @PostMapping("rest")
    public Employee save(@RequestBody Employee employee){
        return restUtilService.save(employee);
    }

    @GetMapping("getEmp")
    public List<Employee> findAll(){
        return restUtilService.findAll();
    }

    @PutMapping("update/{id}")
    public Employee updateEmp(@RequestBody Employee employee){
        return restUtilService.update(employee);
    }

    @DeleteMapping("delete/{id}")
    public void deleteEmp(@PathVariable Long id){
        restUtilService.deleteEmp(id);
    }

    @GetMapping("getbyId/{id}")
    public Employee getById(@PathVariable Long id){
        return restUtilService.getById(id);
    }
}
