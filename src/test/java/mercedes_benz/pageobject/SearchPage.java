package mercedes_benz.pageobject;

import de.testers.basis.frontend.web.DriverWeb;
import de.testers.basis.frontend.web.ValidateWeb;
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
