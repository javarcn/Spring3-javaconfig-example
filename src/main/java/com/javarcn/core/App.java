package com.javarcn.core;

import com.javarcn.config.AppConfig;
import com.javarcn.hello.HelloWorld;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context=new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld helloWorld= (HelloWorld) context.getBean("helloBean");
        helloWorld.printHelloWorld("spring 3 Java config");
    }
}
