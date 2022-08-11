package com.example.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


import javax.persistence.*;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="emp_table")
public class  MyEntity {
    @Id
    private  int empId;
    private  String empName;
    private long empPh;
    private String empEmail;
}
