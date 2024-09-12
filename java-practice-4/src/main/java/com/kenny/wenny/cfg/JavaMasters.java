package com.kenny.wenny.cfg;

public class JavaMasters implements CfgClass {
    @Override
    public void greetStudent() {
        System.out.println("Hello suckers!");
    }

    @Override
    public void notifyStudent(String name, String message) {
        System.out.println("Oi, " + name + ", " + message);
    }
}
