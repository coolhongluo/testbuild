package com.service.lwhtestbuild.controller;



import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class TestLwhtestbuild {

        LwhtestbuildDelegate lwhtestbuildDelegate = new LwhtestbuildDelegate();


    @Test
    public void testhelloworld(){

        String expactReturnValue = "hello"; // You should put the expect String type value here.

        String returnValue = lwhtestbuildDelegate.helloworld("hello");

        assertEquals(expactReturnValue, returnValue);
    }

}