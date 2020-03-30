package com.vinod.Telusko;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
    
    	Vehicle obj = (Vehicle)context.getBean("car");
    	
    //	obj.drive();       
    	//Tyre t = (Tyre)context.getBean("wheel");
    	System.out.println(obj);
    }
}		 