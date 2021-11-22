package storz.pageobject;

import de.testers.basis.frontend.web.DriverWeb;
import de.testers.lib.XPath;

public abstract class AbstractPage {
    protected DriverWeb driverWeb;
    protected AbstractPage(DriverWeb driverWeb) {
        this.driverWeb = driverWeb;
    }
    protected abstract void makeSure();
}
