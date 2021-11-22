package de.testers.basis.frontend.web;

import de.testers.lib.XPath;

public abstract class AbstractWeb {
    private DriverWeb driverWeb;
    private XPath xpath;

    protected AbstractWeb(DriverWeb driverWeb,
                          XPath xpath) {
        this.driverWeb = driverWeb;
        this.xpath = xpath;
    }

    protected AbstractWeb(DriverWeb driverWeb) {
        this.driverWeb = driverWeb;
        this.xpath = null;
    }

}
