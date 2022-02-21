package sickag.monitoring_box.pageobject;

import de.testers.functional_testing.frontend.web.DriverWeb;
import de.testers.functional_testing.frontend.web.ValidateWeb;
import de.testers.lib.XPath;

public class SearchPage extends AbstractPage {
    private XPath searchTitle = new XPath("Carousel", "//*[@id='content']/div/div/div/div[1]/article/header/div/div/h1");

    public SearchPage(DriverWeb driverWeb) {
        super(driverWeb);
        makeSure();
    }

    @Override
    protected void makeSure() {
        new ValidateWeb(driverWeb, searchTitle);
    }


}
