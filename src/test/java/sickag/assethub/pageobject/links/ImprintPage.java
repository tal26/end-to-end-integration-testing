package sickag.assethub.pageobject.links;

import de.testers.functional_testing.frontend.web.DriverWeb;
import de.testers.lib.Environment;
import de.testers.lib.Url;
import sickag.assethub.pageobject._AbstractPageAssetHub;

public class ImprintPage extends _AbstractPageAssetHub {

    public ImprintPage(DriverWeb driverWeb,
                       Environment environment) {
        super(driverWeb);
        this.environment = environment;
        this.baseLink = new Url("https://www.sick.com/gb/en/imprint/w/imprint/");
    }
    @Override
    protected void makeSure() {

    }

    @Override
    public void open() {

    }
}
