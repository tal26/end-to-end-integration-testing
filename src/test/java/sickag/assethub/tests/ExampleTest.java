package sickag.assethub.tests;

import de.testers.functional_testing.frontend.web.DriverWeb;
import org.junit.jupiter.api.Test;
import sickag.assethub.backend.BackendConfig;
import sickag.assethub.lib.ConfigAssetHub;
import sickag.assethub.pageobject.DashboardAssetHubPage;
import sickag.sickid.lib.ConfigSickID;
import sickag.sickid.pageobject.HomePageSickID;

import static io.restassured.RestAssured.given;

public class ExampleTest extends AbstractIntegrationTestAssetHub {
    ExampleTest() {
        super(DriverWeb.BrowserId.CHROMIUM);
    }

    @Test
    void frontEndTest() {
        HomePageSickID home = new HomePageSickID(driver, ConfigSickID.production);
        home.open();

        DashboardAssetHubPage assetHubHome = new DashboardAssetHubPage(driver, ConfigAssetHub.production);
        assetHubHome.open();
        assetHubHome.openDashboard();
    }

    @Test
    void backendTest() {
        given().contentType(BackendConfig.backend.getContentType().getValue())
                .formParam(BackendConfig.backend.getHeaders().get(0).getKey(), BackendConfig.backend.getHeaders().get(0).getValue())
                .formParam(BackendConfig.backend.getHeaders().get(1).getKey(), BackendConfig.backend.getHeaders().get(1).getValue())
                .formParam(BackendConfig.backend.getHeaders().get(2).getKey(), BackendConfig.backend.getHeaders().get(2).getValue())
                .when().post(BackendConfig.backend.getUrl().getValue())
                .then().statusCode(BackendConfig.backend.getExpectedStatus().getValue());

    }
}
