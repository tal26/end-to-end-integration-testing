package sickag.monitoring_box.pageobject;

import de.testers.functional_testing.frontend.web.DriverWeb;

public abstract class _AbstractPageMonitoringBox {
    protected DriverWeb driverWeb;
    protected _AbstractPageMonitoringBox(DriverWeb driverWeb) {
        this.driverWeb = driverWeb;
    }
    protected abstract void makeSure();
}
