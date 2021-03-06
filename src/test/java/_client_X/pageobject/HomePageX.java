package _client_X.pageobject;

import de.testers.functional_testing.frontend.web.*;
import de.testers.lib.Environment;
import de.testers.lib.Url;
import de.testers.lib.User;
import de.testers.lib.XPath;

public class HomePageX extends AbstractPageX {
    private Url url = new Url("http://www.google.com");
    private Environment environment = new Environment(new Url("http://www.google.com"),
            new User("usr", "pwd"));

    private XPath carousel = new XPath("Carousel", "//*[@id='stage']");
    private XPath allowCookies = new XPath("Allow cookies", "//*[@id='onetrust-accept-btn-handler']");
    private XPath searchField = new XPath("Search field", "//*[@id='head-search']");
    private XPath searchButton = new XPath("Search button","//*[@id='head-search-btn']/em");

    public HomePageX(DriverWeb driverWeb) {
        super(driverWeb);
    }

    @Override
    public void open() {
        new SurfWeb(driverWeb, url);
        makeSure();
    }

    public void search(String text) {
        new ClickWeb(driverWeb, allowCookies);
        new FillWeb(driverWeb, searchField, text);
        new ClickWeb(driverWeb, searchButton);

        new SearchPageX(driverWeb);
    }

    @Override
    protected void makeSure() {
        new ValidateWeb(driverWeb, carousel);
    }
}
