package com.epam.defaultmethod;


public class TestDefaultMethods implements A {
    @Override
    public void sayHi() {
        A.super.sayHi();
    }

    public static void main(String[] args) {
        TestDefaultMethods testDefaultMethods = new TestDefaultMethods();
        testDefaultMethods.sayHi();
        A.sayHello();
    }
}
