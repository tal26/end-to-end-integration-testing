package de.testers.basis.frontend.web;

import de.testers.lib.Log;
import de.testers.lib.XPath;

public class ClickWeb extends AbstractWeb {

    public ClickWeb(DriverWeb driverWeb, XPath xpath) {
        super(driverWeb, xpath);
        driverWeb.click(xpath);

        Log.print("Clicked" + xpath.toString());
    }
}
