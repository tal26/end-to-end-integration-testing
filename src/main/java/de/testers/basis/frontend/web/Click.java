package de.testers.basis.frontend.web;

import de.testers.lib.Log;
import de.testers.lib.XPath;

public class Click extends AbstractWeb {

    public Click(DriverWeb driverWeb, XPath xpath) {
        super(driverWeb, xpath);
        driverWeb.click(xpath);

        Log.print("Clicked" + xpath.toString());
    }
}
