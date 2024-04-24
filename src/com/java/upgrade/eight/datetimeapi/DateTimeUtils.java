package com.java.upgrade.eight.datetimeapi;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;

public class DateTimeUtils {

    public static void main(String[] args) {

        // LocalDate: Represents a date without a time zone.
        LocalDate today = LocalDate.now();
        System.out.println("Today's date: " + today);

        // LocalTime: Represents a time without a time zone.
        LocalTime currentTime = LocalTime.now();
        System.out.println("Current time: " + currentTime);

        // LocalDateTime: Represents a date and time without a time zone.
        LocalDateTime currentDateTime = LocalDateTime.now();
        System.out.println(currentDateTime);

        // Instant: Represents a point in time. Similar to java.util.Date, but more
        // accurate.
        Instant instant = Instant.now();
        System.out.println("Current instant: " + instant);

        // Duration: Represents a time span.
        LocalDate startDate = LocalDate.of(2024, 4, 1);
        LocalDate endDate = LocalDate.of(2024, 4, 23);
        Period monthPeriod = Period.between(startDate, endDate);
        System.out.println("Days in period: " + monthPeriod.getDays());
    }

}
