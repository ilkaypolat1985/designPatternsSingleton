package com.designpattern.creational.singleton;

import junit.framework.TestCase;

public class TestSingleton extends TestCase {
    public TestSingleton(String name){
        super(name);
    }

    public void testSingularity(){
        Singleton singleton1 = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();
        assertSame(singleton1, singleton2);
    }

    public void testNoPublicConstructors() throws Exception{
        Class singletonClass = Class.forName(Singleton.class.getName());
        assertEquals("Public Constructors:", 0, singletonClass.getConstructors().length);
    }
}
