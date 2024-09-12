package com.kenny.wenny.days;

public class DayGreeter {
    public void greet(DaysOfWeek dayOfWeek) {
        switch (dayOfWeek) {
            case MONDAY:
            case TUESDAY:
            case WEDNESDAY:
            case THURSDAY:
            case FRIDAY:
                System.out.println("Enjoy work!");
                break;
            case SATURDAY:
            case SUNDAY :
                System.out.println("Have a nice rest!");
        }
    }
}
