package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component("monkey")
public class Monkey implements IAnimal {
    @Autowired
    private Movement movement;
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
        System.out.println("УУУУ АААА");
    }
    public void walking(){
        movement.Walk();
    }
}

