package com.JavaDateTimeExtracter;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale; // Important for month abbreviation

public class DateTimeExtractor {

    public static void main(String[] args) {
        String inputDateString = "2025-07-02T16:10:36";

        // Define the input formatter matching the ISO_LOCAL_DATE_TIME format
        // (which is implicitly handled by LocalDateTime.parse for this string)
        LocalDateTime dateTime = LocalDateTime.parse(inputDateString);

        // 1) HH:MM am/pm
        DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("hh:mma");
        String formattedTime = dateTime.format(timeFormatter).toLowerCase(); // Convert to lowercase for "am/pm"

        // For cases where you want "09:30pm" instead of "09:30PM"
        // If you need "AM" or "PM" in uppercase, remove .toLowerCase()
        // If you want a space, use "hh:mm a"

        // 2) DD Mmm
        // For "Mmm" (e.g., "Jan", "Feb", "Mar"), we need to use a Locale.
        // Locale.ENGLISH is a good general choice.
        DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("dd MMM", Locale.ENGLISH);
        String formattedDate = dateTime.format(dateFormatter);


        System.out.println("Input String: " + inputDateString);
        System.out.println("1) HH:MM am/pm: " + formattedTime);
        System.out.println("2) DD Mmm: " + formattedDate);

        // Example with the specific example output in your question (09:30pm and 05 Jun)
        // Let's assume the input in your example image for HH:MM am/pm was for a different time.
        // For 16:10:36, the output will be 04:10pm.
        // For 2025-07-02, the output will be 02 Jul.
    }
}
