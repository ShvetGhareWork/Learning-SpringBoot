package com.example.demo;

import java.util.Scanner;

// import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Tablet implements Computer {
    // @Qualifier("laptop") // @Qualifier annotation is used to specify which bean should be injected when there are multiple candidates.
    private String tabletName;  

    public void Setup(){
        Scanner scanner  = new Scanner(System.in);
        System.out.println("Enter the name of your tablet: ");
        this.tabletName = scanner.nextLine();
        System.out.println("My "+ this.tabletName + " Tablet is working!");
        scanner.close();
    }
}
