package sickag.id.pageobject;

import de.testers.functional_testing.frontend.web.DriverWeb;

public abstract class AbstractPage {
    protected DriverWeb driverWeb;
    protected AbstractPage(DriverWeb driverWeb) {
        this.driverWeb = driverWeb;
    }
    protected abstract void makeSure();
}
