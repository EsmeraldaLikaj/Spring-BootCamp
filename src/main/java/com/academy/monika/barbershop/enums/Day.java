package com.academy.monika.barbershop.enums;

public enum Day {
    MONDAY("Monday",false),
    TUESDAY("Tuesday",false),
    WEDNESDAY("Wednesday",true),
    THURSDAY("Thursday",true),
    FRIDAY("Friday",true),
    SATURDAY("Saturday",true),
    SUNDAY("Sunday",true);
    private String weekDay;
    private Boolean workingFlag;

    Day(String weekDay,Boolean workingFlag) {
        this.weekDay=weekDay;
        this.workingFlag = workingFlag;
    }

    public Boolean getWorkingFlag() {
        return workingFlag;
    }
}
