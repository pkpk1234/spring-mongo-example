package com.example.springmongoexample.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

/**
 * Created by pkpk1234 on 2017/6/20.
 */
@Document(collection = "Person")
@NoArgsConstructor
@AllArgsConstructor
@Data
@ToString
public class Person {
    @Field("first_name")
    private String firstName;
    @Field("last_name")
    private String lastName;
}
