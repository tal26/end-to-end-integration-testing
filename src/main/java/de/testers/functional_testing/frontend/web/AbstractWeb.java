package de.testers.functional_testing.frontend.web;

import de.testers.lib.Environment;
import de.testers.lib.XPath;

public abstract class AbstractWeb {
    private DriverWeb driverWeb;
    private XPath xpath;
    private Environment environment;

    protected AbstractWeb(DriverWeb driverWeb,
                          XPath xpath) {
        this.driverWeb = driverWeb;
        this.xpath = xpath;
    }

    protected AbstractWeb(DriverWeb driverWeb) {
        this.driverWeb = driverWeb;
        this.xpath = null;
    }

    protected AbstractWeb(DriverWeb driverWeb,
                          Environment environment) {
        this(driverWeb);
        this.environment = environment;
    }

}
