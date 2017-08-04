package com.javarcn.config;

import com.javarcn.hello.HelloWorld;
import com.javarcn.hello.impl.HelloWorldImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author jiacheng
 * @created on 2017/8/4 22:54.
 */
@Configuration
public class AppConfig {

    @Bean(name = "helloBean")
    public HelloWorld helloWorld(){
        return new HelloWorldImpl();
    }

}
