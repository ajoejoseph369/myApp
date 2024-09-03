package com.sample.myApp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Dev{

    @Autowired // field injection
    @Qualifier("laptop")
    private Computer comp;

//    Constructor injection
//    public Dev(Laptop laptop){
//        this.laptop = laptop;
//    }

//    Setter injection
//    @Autowired
//    public void setLaptop(Laptop laptop) {
//        this.laptop = laptop;
//    }

    public void build(){
        comp.compile();
        System.out.println("working on Awesome Project");
    }

}