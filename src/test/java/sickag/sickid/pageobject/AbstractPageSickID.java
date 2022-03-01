package sickag.sickid.pageobject;

import de.testers.functional_testing.frontend.web.DriverWeb;

public abstract class AbstractPageSickID {
    protected DriverWeb driverWeb;
    protected AbstractPageSickID(DriverWeb driverWeb) {
        this.driverWeb = driverWeb;
    }
    protected abstract void makeSure();
}
