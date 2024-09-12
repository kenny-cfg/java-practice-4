package com.kenny.wenny;

import com.kenny.wenny.days.DayGreeter;
import com.kenny.wenny.days.DaysOfWeek;

public class Main {
    public static void main(String[] args) {
        var greeter = new DayGreeter();
        greeter.greet(DaysOfWeek.MONDAY);
        greeter.greet(DaysOfWeek.SATURDAY);
    }
}