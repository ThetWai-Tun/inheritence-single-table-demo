package com.inheritencesingletabledemo;

import com.inheritencesingletabledemo.service.IDatabase;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class InheritenceSingleTableDemoApplication {

    private final IDatabase iDatabase;

    public InheritenceSingleTableDemoApplication(IDatabase iDatabase) {
        this.iDatabase = iDatabase;
    }

    public static void main(String[] args) {
        SpringApplication.run(InheritenceSingleTableDemoApplication.class, args);
    }

    @Bean
    public CommandLineRunner runner(){
        return a ->{
            iDatabase.createTable();
        };
    }
}
