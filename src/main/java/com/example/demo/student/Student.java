package com.example.demo.student;

import java.time.LocalDate;

public class Student {
    private Long ID;
    private String name;
    private String email;
    private LocalDate dob;
    private Integer age;

    public Student() {
    }

    public Student(Long ID,
                   String name,
                   String email,
                   LocalDate dob,
                   Integer age) {
        this.ID = ID;
        this.name = name;
        this.email = email;
        this.dob = dob;
        this.age = age;
    }

    public Student(String name,
                   String email,
                   LocalDate dob,
                   Integer age) {
        this.name = name;
        this.email = email;
        this.dob = dob;
        this.age = age;
    }
}
