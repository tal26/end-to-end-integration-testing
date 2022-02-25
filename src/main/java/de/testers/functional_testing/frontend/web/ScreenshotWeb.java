package de.testers.functional_testing.frontend.web;

import de.testers.lib.Log;

public class ScreenshotWeb extends AbstractWeb {
    public ScreenshotWeb(DriverWeb driverWeb) {
        super(driverWeb);
        String location = driverWeb.takeScreenshot();
        Log.print("Screenshot saved at '" + location + "'");
    }
}
