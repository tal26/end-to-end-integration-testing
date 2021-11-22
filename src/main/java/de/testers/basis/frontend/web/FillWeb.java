package de.testers.basis.frontend.web;

import de.testers.lib.Log;
import de.testers.lib.XPath;

public class FillWeb extends AbstractWeb {
    private String text;

    public FillWeb(DriverWeb driverWeb,
                   XPath xpath,
                   String text) {
        super(driverWeb, xpath);
        this.text = text;

        driverWeb.fill(xpath, text);

        Log.print("Sent text '" + text + "' to" + xpath.toString());
    }
}
