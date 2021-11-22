package de.testers.basis.frontend.web;

import de.testers.lib.Log;

public class Screenshot extends AbstractWeb {
    public Screenshot(DriverWeb driverWeb) {
        super(driverWeb);
        String location = driverWeb.takeScreenshot();

        Log.print("Screenshot saved at '" + location + "'");

    }
}
