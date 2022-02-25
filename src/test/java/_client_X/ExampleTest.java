package _client_X;

import de.testers.functional_testing.frontend.web.*;
import org.junit.jupiter.api.Test;
import _client_X.backend.BackendConfig;
import _client_X.pageobject.HomePage;
import sickag.id.lib.Config;

import static io.restassured.RestAssured.given;

public class ExampleTest extends AbstractIntegrationTest {
    ExampleTest() {
        super(DriverWeb.BrowserId.CHROMIUM);
    }

    private void getThruID() {
        sickag.id.pageobject.HomePage idHome
                = new sickag.id.pageobject.HomePage(driver, Config.productionEnvironment);
        idHome.open();
    }

    @Test
    void frontEndTest() {
        getThruID();
        HomePage home = new HomePage(driver);
        home.open();
        home.search("_client_X");
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
