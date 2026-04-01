package com.example.demo;

import java.util.Scanner;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

// Multiple Implementations are now allowed since
// Bean error pops up when there are multiple implementations 
// of an interface and Spring cannot decide which one to inject.
// Can be resolved by removing the @Component annotation from the 
// unwanted implementation or by using @Qualifier annotation to 
// specify which implementation to inject.
@Component
@Primary // @Primary annotation is used to indicate that this bean should be given preference when multiple candidates are qualified to autowire a single-valued dependency.
public class Desktop implements Computer {

    private String desktopName;
    

    public void Setup(){
        Scanner scanner  = new Scanner(System.in);
        System.out.println("Enter the name of your desktop: ");
        this.desktopName = scanner.nextLine();
        System.out.println("My "+ this.desktopName + " Desktop is working!");
        scanner.close();
    }
}
