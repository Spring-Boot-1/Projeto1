/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.AULA1.entity;

import javax.persistence.*;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Role {
    /*
    CONEXÃO MySQL
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)*/
    //PARA MONGODB TRANSFORMAR VARIAVEIS EM STRING
    @Id
 
    private String id;
    private String name;

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
}
