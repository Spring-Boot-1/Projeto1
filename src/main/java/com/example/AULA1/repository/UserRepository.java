 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.AULA1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.AULA1.entity.User;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<User, Long>{

    @Query("{ 'email' : ?0}")
    User findByEmailQualquerCoisa(String email);
    
    
    //User findByNameIgnoreCaseLike(String Name);
}

