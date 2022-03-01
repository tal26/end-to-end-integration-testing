package de.testers.functional_testing.frontend.web;

import de.testers.lib.Log;

public class WebTestFailedException extends RuntimeException{
    /**
     *
     * @param driverWeb
     * @param errorMessage
     */
    public WebTestFailedException(DriverWeb driverWeb,
                                  String errorMessage) {
        super(errorMessage);

        Log.print(errorMessage);
        try {
            throw new Exception(errorMessage);
        } catch (Exception e) {
            e.printStackTrace();
        }
        new ScreenshotWeb(driverWeb);
    }
}
