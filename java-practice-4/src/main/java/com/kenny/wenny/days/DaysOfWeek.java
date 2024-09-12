package com.kenny.wenny.days;

public enum DaysOfWeek {
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY(false),
    SUNDAY(false);

    private final boolean isWorkingDay;

    DaysOfWeek() {
        this(true);
    }

    DaysOfWeek(boolean isWorkingDay) {
        this.isWorkingDay = isWorkingDay;
    }

    public boolean getIsWorkingDay() {
        return isWorkingDay;
    }
}
