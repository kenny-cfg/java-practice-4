package com.kenny.wenny.cfg;

// Singleton pattern
public class JavaMasters implements CfgClass {
    private static JavaMasters instance;

    private JavaMasters() {
    }

    @Override
    public void greetStudent() {
        System.out.println("Hello suckers!");
    }

    @Override
    public void notifyStudent(String name, String message) {
        System.out.println("Oi, " + name + ", " + message);
    }

    public static JavaMasters getInstance() {
        if (instance == null) {
            instance = new JavaMasters();
        }
        return instance;
    }
}
