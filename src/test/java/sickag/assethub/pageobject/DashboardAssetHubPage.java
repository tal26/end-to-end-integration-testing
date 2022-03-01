package sickag.assethub.pageobject;

import de.testers.functional_testing.frontend.web.*;
import de.testers.lib.Environment;
import de.testers.lib.Url;
import de.testers.lib.XPath;

public class DashboardAssetHubPage extends _AbstractPageAssetHub {

    /*
        //*[contains(text(), 'Asset Management')]
        "//*[regexp:test(@davinci-core-drawer-navigation-item, 'Dashboard')]";
         */
    /* Side menu */
    private XPath sideMenuDashboard = new XPath("Dashboard side menu link",
            "/html/body/app-root/feature-toggle-provider/app-sick-header/div[2]/app-navigation-menu/davinci-core-drawer-navigation/davinci-core-drawer-navigation-item[1]");
    private XPath sideMenuManagement = new XPath("Asset Management side menu link",
            "/html/body/app-root/feature-toggle-provider/app-sick-header/div[2]/app-navigation-menu/davinci-core-drawer-navigation/davinci-core-drawer-navigation-item[2]");
    private XPath sideMenuMapView = new XPath("Map View side menu link",
            "/html/body/app-root/feature-toggle-provider/app-sick-header/div[2]/app-navigation-menu/davinci-core-drawer-navigation/davinci-core-drawer-navigation-item[3]");
    private XPath sideMenuAssetSearch = new XPath("Asset Search side menu link",
            "/html/body/app-root/feature-toggle-provider/app-sick-header/div[2]/app-navigation-menu/davinci-core-drawer-navigation/davinci-core-drawer-navigation-item[4]");
    private XPath sideMenuServiceModule = new XPath("ServiceModule side menu link",
            "/html/body/app-root/feature-toggle-provider/app-sick-header/div[2]/app-navigation-menu/davinci-core-drawer-navigation/davinci-core-drawer-navigation-item[5]");
    private XPath sideMenuCloudDestinations = new XPath("Cloud Destinations side menu link",
            "/html/body/app-root/feature-toggle-provider/app-sick-header/div[2]/app-navigation-menu/davinci-core-drawer-navigation/davinci-core-drawer-navigation-item[6]");
    /* Tiles */
    private XPath tileAssetManagement = new XPath("Asset management tile",
            "/html/body/app-root/feature-toggle-provider/app-sick-header/div[2]/div/app-home/p-scrollpanel/div/div[1]/div/div/div/app-card[1]/div");
    private XPath tileLiveConnect = new XPath("Live Connect tile",
            "/html/body/app-root/feature-toggle-provider/app-sick-header/div[2]/div/app-home/p-scrollpanel/div/div[1]/div/div/div/app-card[2]/div");
    private XPath tileMapView = new XPath("Map View tile",
            "/html/body/app-root/feature-toggle-provider/app-sick-header/div[2]/div/app-home/p-scrollpanel/div/div[1]/div/div/div/app-card[3]/div");
    private XPath tileServiceModule = new XPath("ServiceModule tile",
            "/html/body/app-root/feature-toggle-provider/app-sick-header/div[2]/div/app-home/p-scrollpanel/div/div[1]/div/div/div/app-card[4]/div");

    /* Link at the bottom */
    private XPath linkImprint = new XPath("Imprint link",
            "//*[@id='sick-footer']/a[1]");
    private XPath linkTermsAndConditions = new XPath("Terms and Conditions link",
            "//*[@id='sick-footer']/a[2]");
    private XPath linkTermsOfUse = new XPath("Terms of Use link",
            "//*[@id='sick-footer']/a[3]");
    private XPath linkDataProtection = new XPath("Data Protection link",
            "//*[@id='sick-footer']/a[4]");


    public DashboardAssetHubPage(DriverWeb driverWeb,
                                 Environment environment) {
        super(driverWeb);
        this.environment = environment;
        this.baseLink = new Url(environment.url.getValue() + "/home");
    }

    @Override
    public void open() {
        new SurfWeb(driverWeb, environment);
        new SurfWeb(driverWeb, baseLink);
        makeSure();
    }

    public void openDashboard () {
        new ClickWeb(driverWeb, sideMenuDashboard);
    }

    public void openAssetManagement () {
        new ClickWeb(driverWeb, sideMenuManagement);
    }

    public void openMapView () {
        new ClickWeb(driverWeb, sideMenuMapView);
    }

    public void openAssetSearch () {
        new ClickWeb(driverWeb, sideMenuAssetSearch);
    }

    public void openServiceModule () {
        new ClickWeb(driverWeb, sideMenuServiceModule);
    }

    public void openCloudDestinations () {
        new ClickWeb(driverWeb, sideMenuCloudDestinations);
    }


    @Override
    protected void makeSure() {
        new ValidateWeb(driverWeb, sideMenuDashboard);
        new ValidateWeb(driverWeb, sideMenuManagement);
        new ValidateWeb(driverWeb, sideMenuMapView);
        new ValidateWeb(driverWeb, sideMenuAssetSearch);
        new ValidateWeb(driverWeb, sideMenuServiceModule);
        new ValidateWeb(driverWeb, sideMenuCloudDestinations);

        new ValidateWeb(driverWeb, tileAssetManagement);
        new ValidateWeb(driverWeb, tileLiveConnect);
        new ValidateWeb(driverWeb, tileMapView);
        new ValidateWeb(driverWeb, tileServiceModule);

        new ValidateWeb(driverWeb, linkImprint);
        new ValidateWeb(driverWeb, linkTermsAndConditions);
        new ValidateWeb(driverWeb, linkTermsOfUse);
        new ValidateWeb(driverWeb, linkDataProtection);
    }
}
