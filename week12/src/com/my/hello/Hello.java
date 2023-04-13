package com.my.hello;

public class Hello {
    String toWhom = "world";
    public Hello() { }
    public Hello(String whom) {
        this.toWhom = whom;
    }
    public void setWhom(String whom) { this.toWhom = whom; }
    public void sayHello() {
        System.out.println("Hello " + this.toWhom);
    }
}