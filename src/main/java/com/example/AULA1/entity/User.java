/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.AULA1.entity;

import javax.persistence.*;
import java.util.*;
import org.hibernate.*;
import org.springframework.data.mongodb.core.mapping.Document;

@Document

public class User {
    /*
    CONEXÃO MySQL
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)*/
    @Id
    
 
    private String id;
    private String age;
    private String name;
    private String email;
    // MySQL @ManyToMany
    private Set <Role> roles;
    
     public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    
}
