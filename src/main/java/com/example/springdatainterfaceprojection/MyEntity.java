package com.example.springdatainterfaceprojection;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
class MyEntity
{
    @Id
    private Long id;
    private String name;
    private Integer age;
}
