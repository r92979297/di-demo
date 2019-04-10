package com.fafik.controllers;

import com.fafik.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class SetterInjectedController {
    private GreetingService greetngService;

    public String sayHello(){
        return greetngService.sayGreeting();
    }

    @Autowired
    public void setGreetngService(@Qualifier("setterGreetingService") GreetingService greetngService){
        this.greetngService=greetngService;
    }
}
