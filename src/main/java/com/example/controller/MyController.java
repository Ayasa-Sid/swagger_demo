package com.example.controller;


import com.example.entity.MyEntity;
import com.example.service.MyService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;



@RestController
@RequestMapping("/api/v3")
@Api(value = "Controller")
public class MyController {

    @Autowired
    private MyService myService;

    @ApiOperation(value = "give the value and store in database" )
    @PostMapping("/addEmp")
    public MyEntity addEmp(@RequestBody MyEntity myEntity) {
        return this.myService.saveEmployee(myEntity);
    }



    @ApiOperation(value ="show the given value from database" )
    @GetMapping("/emp/{id}")
    public MyEntity findEmpById(@PathVariable int id) {
        return this.myService.getEmployeesById(id);
    }


    }






