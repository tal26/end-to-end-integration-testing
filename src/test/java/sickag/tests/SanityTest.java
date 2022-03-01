package sickag.tests;

import org.junit.jupiter.api.Test;
import sickag.assethub.pageobject.DashboardAssetHubPage;
import sickag.sickid.pageobject.HomePageSickID;

public class SanityTest extends _Test {
    SanityTest() {
        super();
    }

    @Test
    public void goThruSideMenuLinksTest() {
        new HomePageSickID(driver, sickIdEnvironment).open();
        new DashboardAssetHubPage(driver, assetHubEnvironment).open();
        /*
        new DashboardAssetHubPage(driver, assetHubEnvironment).openAssetManagement();
        new DashboardAssetHubPage(driver, assetHubEnvironment).openDashboard();
        new DashboardAssetHubPage(driver, assetHubEnvironment).openMapView();
        new DashboardAssetHubPage(driver, assetHubEnvironment).openAssetSearch();
        new DashboardAssetHubPage(driver, assetHubEnvironment).openServiceModule();
        new DashboardAssetHubPage(driver, assetHubEnvironment).openCloudDestinations();

         */
    }
}
