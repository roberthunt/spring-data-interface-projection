package com.example.springdatainterfaceprojection;

import org.springframework.data.repository.CrudRepository;

public interface MyEntityRepository extends CrudRepository<MyEntity, Long>
{
    MyProjection findById(Long Id);
}
