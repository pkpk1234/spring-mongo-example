package com.example.springmongoexample;

import com.example.springmongoexample.model.Person;
import com.example.springmongoexample.repository.PersonRepository;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import static org.junit.Assert.*;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class SpringMongoExampleApplicationTests {
    @Autowired
    private PersonRepository personRepository;


    @Test
    public void contextLoads() {
        List<Person> persons = this.personRepository.findAll();
        log.info("persons is {}",persons);
        assertEquals(6,persons.size());
    }
    
}
