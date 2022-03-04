package sickag.sickid.pageobject;

import de.testers.functional_testing.frontend.web.DriverWeb;

public abstract class _AbstractPageSickID {
    protected DriverWeb driverWeb;
    protected _AbstractPageSickID(DriverWeb driverWeb) {
        this.driverWeb = driverWeb;
    }
    protected abstract void makeSure();
}
