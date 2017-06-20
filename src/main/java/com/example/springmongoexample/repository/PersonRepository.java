package com.example.springmongoexample.repository;

import com.example.springmongoexample.model.Person;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * Created by pkpk1234 on 2017/6/20.
 */
public interface PersonRepository extends MongoRepository<Person,Long> {
}
