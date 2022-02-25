package sickag.assethub;

import de.testers.functional_testing.frontend.web.DriverWeb;
import de.testers.functional_testing.frontend.web.ScreenshotWeb;
import org.junit.jupiter.api.Test;
import sickag.assethub.backend.BackendConfig;
import sickag.assethub.pageobject.HomePage;
import sickag.id.lib.Config;

import static io.restassured.RestAssured.given;

public class ExampleTest extends AbstractIntegrationTest {
    ExampleTest() {
        super(DriverWeb.BrowserId.CHROMIUM);
    }

    @Test
    void frontEndTest() {

        HomePage assetHubHome = new HomePage(driver, Config.productionEnvironment);
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
