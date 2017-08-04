package com.javarcn.hello.impl;

import com.javarcn.hello.HelloWorld;

/**
 * @author jiacheng
 * @created on 2017/8/4 22:55.
 */
public class HelloWorldImpl implements HelloWorld {

    public void printHelloWorld(String msg) {
        System.out.println("hello : " + msg);
    }
}
