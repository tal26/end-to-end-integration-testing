package storz.pageobject;

import de.testers.basis.frontend.web.Click;
import de.testers.basis.frontend.web.DriverWeb;
import de.testers.basis.frontend.web.Fill;
import de.testers.basis.frontend.web.Surf;
import de.testers.lib.Url;
import de.testers.lib.XPath;

public class Home{
    private DriverWeb driverWeb;
    private Url url = new Url("http://www.storz.com");

    private XPath allowCookies = new XPath("Allow cookies", "//*[@id='onetrust-accept-btn-handler']");
    private XPath searchField = new XPath("Search field", "//*[@id='head-search']");
    private XPath searchButton = new XPath("Search button","//*[@id='head-search-btn']/em");

    public Home(DriverWeb driverWeb) {
        this.driverWeb = driverWeb;
    }

    public void open() {
        new Surf(driverWeb, url);
    }

    public void search(String text) {
        new Click(driverWeb, allowCookies);
        new Fill(driverWeb, searchField, text);
        new Click(driverWeb, searchButton);
    }
}
