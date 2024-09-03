package com.sample.myApp;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
//@Primary //one way of doing it //another way would be to add @Qualifier(laptop) in Dev.java
public class Laptop implements Computer {

    public void compile(){

        System.out.println("Compiling with 404 bugs!");
    }

}