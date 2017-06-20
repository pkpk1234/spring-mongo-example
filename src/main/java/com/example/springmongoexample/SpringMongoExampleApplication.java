package com.example.springmongoexample;

import com.example.springmongoexample.model.Person;
import com.example.springmongoexample.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@SpringBootApplication
public class SpringMongoExampleApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringMongoExampleApplication.class, args);
    }
}

@Component
class InitRunner implements CommandLineRunner {

    private final PersonRepository personRepository;

    @Autowired
    public InitRunner(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        Person person1 = new Person("li", "jiaming");
        Person person2 = new Person("li", "wei");
        Person person3 = new Person("xiong", "juanjuan");
        Person person4 = new Person("qing", "xiangzhi");
        Person person5 = new Person("yao", "chuancun");
        Person person6 = new Person("cao", "yang");
        this.personRepository.save(Arrays.asList(person1, person2, person3, person4, person5, person6));
    }
}