package sickag.monitoring_box.pageobject;

import de.testers.basis.frontend.web.*;
import de.testers.lib.Url;
import de.testers.lib.XPath;

public class HomePage extends AbstractPage {
    private Url url = new Url("http://www.google.com");

    private XPath carousel = new XPath("Carousel", "//*[@id='stage']");
    private XPath allowCookies = new XPath("Allow cookies", "//*[@id='onetrust-accept-btn-handler']");
    private XPath searchField = new XPath("Search field", "//*[@id='head-search']");
    private XPath searchButton = new XPath("Search button","//*[@id='head-search-btn']/em");

    public HomePage(DriverWeb driverWeb) {
        super(driverWeb);
    }

    public void open() {
        new SurfWeb(driverWeb, url);
        makeSure();
    }

    public void search(String text) {
        new ClickWeb(driverWeb, allowCookies);
        new FillWeb(driverWeb, searchField, text);
        new ClickWeb(driverWeb, searchButton);

        new SearchPage(driverWeb);
    }

    @Override
    protected void makeSure() {
        new ValidateWeb(driverWeb, carousel);
    }
}
