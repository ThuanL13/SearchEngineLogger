package com.pluralsight;

import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.Scanner;

public class SearchEngineLogger {
    // Method to log user action
    public static void logAction(String action) {
        try {
            // Opening logs.txt to append
            FileWriter writer = new FileWriter("logs.txt", true);

            // Timestamp and action
            writer.write(LocalDateTime.now() + "-" + action + "\n");

            writer.close();
        }catch (IOException e) {
            System.out.println("Error writing to file.");
        }
    }
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        // Launching log application
        logAction("Application Launched");

        // Prompting user for search term
        System.out.println("Enter a search term: ");

    }
}
