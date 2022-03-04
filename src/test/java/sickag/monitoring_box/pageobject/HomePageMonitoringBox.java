package sickag.monitoring_box.pageobject;

import de.testers.functional_testing.frontend.web.*;
import de.testers.lib.Url;
import de.testers.lib.XPath;

public class HomePageMonitoringBox extends _AbstractPageMonitoringBox {
    private Url url = new Url("http://www.google.com");
    /* */
    private XPath dashboardTab;
    private XPath dashboardErrors;
    private XPath dashboardWarning;
    private XPath dashboardUnknown;
    private XPath dashboardOk;
    private XPath[] dashboardDevices;
    private XPath dashboardShowMoreButton;
    private XPath dashboardJumpToTop;
    /* */
    private XPath devicesTab;
    private XPath devicesSearchField;
    private XPath devicesFilterErrors;
    private XPath devicesFilterWarnings;
    private XPath devicesFilterUnknown;
    private XPath devicesFilterOk;
    private XPath devicesFilterDeviceType;
    private XPath devicesFilterDeviceLocation;
    private XPath devicesFilterDeviceOwner;
    private XPath devicesDevicesTableHeaderState;
    private XPath devicesDevicesTableHeaderName;
    private XPath devicesDevicesTableHeaderType;
    private XPath devicesDevicesTableHeaderLocation;
    //TODO devices list, rows
    /* */
    private XPath hamburger;
    private XPath hamburgerMonitoringBoxNewFeaturesLink;
    private XPath hamburgerMonitoringBoxLanguageLink;
    private XPath hamburgerMonitoringBoxSettings;
    private XPath hamburgerSickIdUpdateProfile;
    private XPath hamburgerSickIdChangePassword;
    private XPath hamburgerSupportFAQ;
    private XPath hamburgerSupportFeedback;
    //TODO links, logout

    public HomePageMonitoringBox(DriverWeb driverWeb) {
        super(driverWeb);
    }

    public void open() {
        new SurfWeb(driverWeb, url);
        makeSure();
    }

    public void search(String text) {


    }

    @Override
    protected void makeSure() {
        //new ValidateWeb(driverWeb, carousel);
    }
}
