package _client_X.pageobject;

import de.testers.functional_testing.frontend.web.DriverWeb;
import de.testers.functional_testing.frontend.web.ValidateWeb;
import de.testers.lib.XPath;

public class SearchPageX extends AbstractPageX {
    private XPath searchTitle = new XPath("Carousel", "//*[@id='content']/div/div/div/div[1]/article/header/div/div/h1");

    public SearchPageX(DriverWeb driverWeb) {
        super(driverWeb);
        makeSure();
    }

    @Override
    public void open() {

    }

    @Override
    protected void makeSure() {
        new ValidateWeb(driverWeb, searchTitle);
    }
}
