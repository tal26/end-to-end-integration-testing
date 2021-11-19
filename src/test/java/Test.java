import de.testers.basis.frontend.web.DriverWeb;

public abstract class Test {
    protected DriverWeb.BrowserId browserId;
    protected DriverWeb driverWeb = new DriverWeb(DriverWeb.BrowserId.CHROMIUM);

    protected Test(DriverWeb.BrowserId browserId) {
        this.browserId = browserId;
        driverWeb = new DriverWeb(browserId);
    }
}
