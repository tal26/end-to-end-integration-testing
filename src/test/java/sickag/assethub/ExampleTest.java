package sickag.assethub;

import de.testers.functional_testing.frontend.web.DriverWeb;
import de.testers.functional_testing.frontend.web.ScreenshotWeb;
import org.junit.jupiter.api.Test;
import sickag.assethub.backend.BackendConfig;
import sickag.assethub.pageobject.HomePage;

import static io.restassured.RestAssured.given;

public class ExampleTest extends AbstractIntegrationTest {
    ExampleTest() {
        super(DriverWeb.BrowserId.CHROMIUM);
    }

    @Test
    void frontEndTest() {
        HomePage home = new HomePage(driver);
        home.open();
        home.search("_client_X");

        new ScreenshotWeb(driver);
        driver.quit();
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
