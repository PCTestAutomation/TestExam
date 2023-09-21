package com.nagp;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AppTest 
{
	static int a;
	static int b;
	static int add;
	
	@BeforeTest
    public void setUp()
    {
        a = 5;
        b = 99;
    }
	
    @Test
    public void positiveScenario()
    {
        add = a+b;
        System.out.println("Result of two numbers: " + add);
        Assert.assertEquals(add, 104);
    }
    
    @Test
    public void negativeScenario()
    {
    	add = a+b;
        System.out.println("Result of two numbers: " + add);
        Assert.assertNotEquals(add, 103);
    }
    
    @AfterTest
    public void tearDown()
    {
        System.gc();
    }
}
