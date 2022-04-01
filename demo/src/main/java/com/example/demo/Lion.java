package com.example.demo;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class Lion implements IAnimal{
    public Lion (){
    }
    @PostConstruct
    public void postConstruct(){
        System.out.println("Я родился!");
    }
    @PreDestroy
    public void preDestroy(){
        System.out.println("Я вмер!");
    }
    @Override
    public void scream(){
        System.out.println("RRRRRRRR");
    }
}
