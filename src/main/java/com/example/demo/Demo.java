package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
// Conponent annotation is used to indicate that a class is a Spring component. It is a generic stereotype for any Spring-managed component.
public class Demo {

    @Autowired // @Autowired annotation is used to automatically inject the dependent beans into a class. It can be used on constructors, methods, and fields.
    @Qualifier("tablet") // @Qualifier annotation is used to specify which bean should be injected when there are multiple candidates.
    private Computer computer;

    // Constructor Injection Does not require @Autowired annotation in Spring 4.3 and later versions
    // public Demo(Laptop laptop) {
    //     this.laptop = laptop;
    // } 

    public Demo(Computer computer) {
        this.computer = computer;
    }

    // Setter Injection, Field Injection, and Method Injection require @Autowired annotation in Spring 4.3 and later versions
    // @Autowired
    // public void setLaptop(Laptop laptop) {
    //     this.laptop = laptop;
    // }
    
    public void build(){
        computer.Setup();
        System.out.println("Working Yes!");
    }
}
