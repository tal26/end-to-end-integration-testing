package de.testers.lib;

public class Time {
    public static void sleep(int millisecondsToSleep) {
        Log.print("Will sleep for a " + millisecondsToSleep + " ms...");
        try {
            Thread.sleep(millisecondsToSleep);
        } catch (InterruptedException interruptedException) {
            Log.print(interruptedException.getMessage());
        }
    }
}
