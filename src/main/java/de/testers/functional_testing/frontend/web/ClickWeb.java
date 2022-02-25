package de.testers.functional_testing.frontend.web;

import de.testers.lib.Log;
import de.testers.lib.XPath;

public class ClickWeb extends AbstractWeb {

    public ClickWeb(DriverWeb driverWeb, XPath xpath) {
        super(driverWeb, xpath);
        Log.print("Clicking" + xpath.toString());
        driverWeb.click(xpath);
    }
}
