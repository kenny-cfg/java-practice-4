package com.kenny.wenny;

import com.kenny.wenny.cfg.CfgClass;
import com.kenny.wenny.cfg.JavaMasters;

public class Main {
    public static void main(String[] args) {
        CfgClass javaMasters = new JavaMasters();
        javaMasters.greetStudent();
        javaMasters.notifyStudent("Erin", "Yo, how's it goin'?");
    }
}