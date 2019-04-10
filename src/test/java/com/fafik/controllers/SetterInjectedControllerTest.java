package com.fafik.controllers;

import com.fafik.services.GreetingServiceImpl;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SetterInjectedControllerTest {

    private SetterInjectedController  setterInjectedController;

    @Before
    public void setup() throws Exception{
        this.setterInjectedController = new SetterInjectedController();
        this.setterInjectedController.setGreetngService(new GreetingServiceImpl());
    }

    @Test
    public void testGreeting() throws Exception{
        assertEquals(GreetingServiceImpl.HELLO_GURUS,setterInjectedController.sayHello());
    }
}
