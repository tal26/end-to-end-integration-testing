package sickag.assethub.pageobject;

import de.testers.functional_testing.frontend.web.*;
import de.testers.lib.Environment;
import de.testers.lib.Url;
import de.testers.lib.XPath;

public class HomePage extends AbstractPage {
    private Environment environment;

    private XPath dashboardSideMenuLink = new XPath("Dashboard side menu link",
            "/html/body/app-root/feature-toggle-provider/app-sick-header/div[2]/app-navigation-menu/davinci-core-drawer-navigation/davinci-core-drawer-navigation-item[1]//div[1]");
    private XPath assetManagementLink = new XPath("", "");
    private XPath mapViewSideMenuLink = new XPath("Mapview side menu link", "");
    private XPath assetSearchSideMenuLink = new XPath("Mapview side menu link", "");
    private XPath serviceModuleSideMenuLink = new XPath("ServiceModule side menu link", "");
    private XPath cloudDestinationsSideMenuLink = new XPath("Cloud destinations side menu link", "");

    public HomePage(DriverWeb driverWeb,
                    Environment environment) {
        super(driverWeb);
        this.environment = environment;
    }

    public void open() {
        new SurfWeb(driverWeb, environment);
        makeSure();
    }

    public void openDashboard () {
        new ClickWeb(driverWeb, dashboardSideMenuLink);
    }

    public void openAssetManagement () {
        new ClickWeb(driverWeb, assetManagementLink);
    }

    public void openMapView () {
        new ClickWeb(driverWeb, mapViewSideMenuLink);
    }

    public void openAssetSearch () {
        new ClickWeb(driverWeb, assetSearchSideMenuLink);
    }

    public void openServiceModule () {
        new ClickWeb(driverWeb, serviceModuleSideMenuLink);
    }

    public void openCloudDestinations () {
        new ClickWeb(driverWeb, cloudDestinationsSideMenuLink);
    }


    @Override
    protected void makeSure() {
        new ValidateWeb(driverWeb, dashboardSideMenuLink);
        new ValidateWeb(driverWeb, assetManagementLink);
        new ValidateWeb(driverWeb, mapViewSideMenuLink);
        new ValidateWeb(driverWeb, assetSearchSideMenuLink);
        new ValidateWeb(driverWeb, serviceModuleSideMenuLink);
        new ValidateWeb(driverWeb, cloudDestinationsSideMenuLink);
    }
}
