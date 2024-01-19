package com.example.spring.service;

import com.example.spring.entity.Employee;
import org.springframework.http.*;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.client.RestTemplate;
import java.util.List;
import static org.springframework.http.HttpHeaders.ACCEPT;

@Service
public class RestUtilService {

    private HttpHeaders getJsonHeaders() {
        final HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        return headers;
    }

    //save Employee(create Employee)--POST
    public Employee save(Employee employee){
        HttpHeaders headers = getJsonHeaders();
        headers.set(ACCEPT, MediaType.APPLICATION_JSON_VALUE);
        HttpEntity<Employee> request = new HttpEntity<>(employee, headers);
        ResponseEntity<Employee> response =new RestTemplate().exchange("http://localhost:8081/at-qms/emp", HttpMethod.POST, request, Employee.class);
        return response.getBody();
    }

    //Get All Employees--GET
    public List<Employee> findAll(){
        HttpHeaders headers = getJsonHeaders();
        headers.set(ACCEPT, MediaType.APPLICATION_JSON_VALUE);
        HttpEntity<List<Employee>> request = new HttpEntity<>(headers);
        ResponseEntity<List> response =new RestTemplate().exchange("http://localhost:8081/at-qms/emp1", HttpMethod.GET,request, List.class);
        List<Employee> body = (List<Employee>) response.getBody();
        return body;
    }
    //-----------------

    //Update Employee ---PUT
    public Employee update(Employee employee){
        HttpHeaders headers = getJsonHeaders();
        headers.set(ACCEPT, MediaType.APPLICATION_JSON_VALUE);
        HttpEntity<Employee> request = new HttpEntity<>(employee,headers);
        ResponseEntity<Employee> response =new RestTemplate().exchange("http://localhost:8081/at-qms/update/4", HttpMethod.PUT, request, Employee.class);
        return response.getBody();
    }

    //delete Employee -- DELETE
    public void deleteEmp(@PathVariable Long id){
        HttpHeaders headers = getJsonHeaders();
        headers.set(ACCEPT, MediaType.APPLICATION_JSON_VALUE);
        HttpEntity<Employee> request = new HttpEntity<>(headers);
        ResponseEntity<Employee> response =new RestTemplate().exchange("http://localhost:8081/at-qms/delete/4", HttpMethod.DELETE, request, Employee.class);
        response.getBody();
    }

    //Get Employee By Id-- GET
    public Employee getById(@PathVariable Long id){
        HttpHeaders headers = getJsonHeaders();
        headers.set(ACCEPT, MediaType.APPLICATION_JSON_VALUE);
        HttpEntity<Employee> request = new HttpEntity<>(headers);
        ResponseEntity<Employee> response =new RestTemplate().exchange("http://localhost:8081/at-qms/getbyId/1", HttpMethod.GET, request, Employee.class);
        return response.getBody();
    }
}
