package sickag.assethub.pageobject;

import de.testers.functional_testing.frontend.web.DriverWeb;
import de.testers.functional_testing.frontend.web.SurfWeb;
import de.testers.lib.Environment;
import de.testers.lib.Url;

public abstract class _AbstractPageAssetHub {
    protected Environment environment;
    protected Url baseLink;
    protected DriverWeb driverWeb;
    protected _AbstractPageAssetHub(DriverWeb driverWeb) {
        this.driverWeb = driverWeb;
    }
    public abstract void open();
    protected abstract void makeSure();

    /**
     *
     */
    protected void getToBase() {
        new SurfWeb(driverWeb, baseLink);
    }
}
