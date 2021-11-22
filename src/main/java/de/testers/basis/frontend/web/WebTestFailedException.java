package de.testers.basis.frontend.web;

import de.testers.lib.Log;

public class WebTestFailedException extends RuntimeException{
    public WebTestFailedException(DriverWeb driverWeb,
                                  String errorMessage) {
        super(errorMessage);

        Log.print(errorMessage);
        new ScreenshotWeb(driverWeb);
    }
}
