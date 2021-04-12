
package com.example.AULA1.confing;

import com.example.AULA1.entity.User;
import com.example.AULA1.repository.UserRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

@Component
public class DataInitializr implements ApplicationListener<ContextRefreshedEvent>{
    
    @Autowired
    UserRepository userrepository;
    
    @Override
    
    public void onApplicationEvent (ContextRefreshedEvent  arg0){
        System.out.println("Entrou aqui!!!");
        
        List<User> users = userrepository.findAll() ;
        
        
        if(users.isEmpty()){
            createUser("Enzo","qualquer1@gmail.com");
            createUser("Igor","qualquer2@gmail.com");
            createUser("Matheus","qualquer3@gmail.com");
            
       
        }
        User user = userrepository.findByEmailQualquerCoisa("qualquer1@gmail.com");
        
        System.out.println(user.getName());
        
        /*userrepository.deleteById(2l);
        User user =userrepository.getOne(1l);
        user.setEmail("frederico@gmail.com");
        user.setName("Frederico");
        userrepository.save(user);
        User user = userrepository.getOne(1l);
        user.setName("Eustaquio");
        user.setEmail("estaquiooliv@gmail.com");
        userrepository.save(user);*/
        
    
    }
    
    public void createUser(String name,String email){
        
        User user = new User ();
        user.setEmail(email);
        user.setName(name);
        
        userrepository.save(user);
}
}
