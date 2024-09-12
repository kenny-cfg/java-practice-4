package com.kenny.wenny.days;

public class DayGreeter {
    public void greet(DaysOfWeek dayOfWeek) {
        if (dayOfWeek.getIsWorkingDay()) {
            System.out.println("enjoy work!");
        } else {
            System.out.println("have a nicer rest!");
        }
    }
}
