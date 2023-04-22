package com.example.findholidaysapp.model;

public class HolidayInfo {
    int id;
    String holiday_name;
    String Holiday_date;

    public HolidayInfo (String name, String date) {
        this.holiday_name = name;
        this.Holiday_date = date;
    }

    public String getHoliday_name() {
        return holiday_name;
    }

    public String getHoliday_date() {
        return Holiday_date;
    }
}
