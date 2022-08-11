package com.example.service;

import com.example.entity.MyEntity;
import com.example.repository.MyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class MyService {
    @Autowired
    public MyRepository myRepository;

    public MyEntity saveEmployee(MyEntity myEntity) {
        return this.myRepository.save(myEntity);
    }


    public MyEntity getEmployeesById(int id) {
        return this.myRepository.findById(id).orElse(null);
    }

}
