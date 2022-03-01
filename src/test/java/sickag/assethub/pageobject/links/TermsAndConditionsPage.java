package sickag.assethub.pageobject.links;

import de.testers.functional_testing.frontend.web.DriverWeb;
import de.testers.lib.Environment;
import de.testers.lib.Url;
import sickag.assethub.pageobject._AbstractPageAssetHub;

public class TermsAndConditionsPage extends _AbstractPageAssetHub {
    public TermsAndConditionsPage(DriverWeb driverWeb,
                                  Environment environment) {
        super(driverWeb);
        this.environment = environment;
        this.baseLink = new Url("https://www.sick.com/gb/en/terms-and-conditions/w/tac/");
    }

    @Override
    protected void makeSure() {

    }

    @Override
    public void open() {

    }
}
