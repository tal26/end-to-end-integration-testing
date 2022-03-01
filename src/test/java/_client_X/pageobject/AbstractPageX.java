package _client_X.pageobject;

import de.testers.functional_testing.frontend.web.DriverWeb;
import de.testers.lib.Environment;

public abstract class AbstractPageX {
    protected Environment environment;
    protected DriverWeb driverWeb;
    protected AbstractPageX(DriverWeb driverWeb) {
        this.driverWeb = driverWeb;
    }
    protected abstract void makeSure();
    protected abstract void open();
}
