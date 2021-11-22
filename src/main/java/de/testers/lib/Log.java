package de.testers.lib;

public class Log {
    private static String TAB = "\t";

    public static void print(String message) {
        String currentDateTime = Watch.getCurrentDateTime();
        System.out.println(currentDateTime + Log.TAB + message);
    }
}
