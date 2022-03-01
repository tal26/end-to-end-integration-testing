package de.testers.functional_testing.frontend.web;

import de.testers.lib.Log;
import de.testers.lib.XPath;

public class FillWeb extends AbstractWeb {
    private String text;

    public FillWeb(DriverWeb driverWeb,
                   XPath xpath,
                   String text) {
        super(driverWeb, xpath);
        this.text = text;

        Log.print("Sending text '" + text + "' to " + xpath.toString());
        driverWeb.fill(xpath, text);
    }
}
