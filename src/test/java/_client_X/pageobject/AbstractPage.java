package _client_X.pageobject;

import de.testers.basis.frontend.web.DriverWeb;

public abstract class AbstractPage {
    protected DriverWeb driverWeb;
    protected AbstractPage(DriverWeb driverWeb) {
        this.driverWeb = driverWeb;
    }
    protected abstract void makeSure();
}