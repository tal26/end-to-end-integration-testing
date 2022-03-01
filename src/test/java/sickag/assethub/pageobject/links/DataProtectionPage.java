package sickag.assethub.pageobject.links;

import de.testers.functional_testing.frontend.web.DriverWeb;
import de.testers.functional_testing.frontend.web.SurfWeb;
import de.testers.lib.Environment;
import de.testers.lib.Url;
import sickag.assethub.pageobject._AbstractPageAssetHub;

public class DataProtectionPage extends _AbstractPageAssetHub {

    public DataProtectionPage(DriverWeb driverWeb,
                                       Environment environment) {
        super(driverWeb);
        this.environment = environment;
        this.baseLink = new Url("https://www.sick.com/gb/en/privacy-policy/w/dataprotection/");
    }

    @Override
    protected void makeSure() {

    }

    @Override
    public void open() {
        new SurfWeb(driverWeb, baseLink);
    }
}
