package _client_X.tests;

import de.testers.functional_testing.frontend.web.*;
import org.junit.jupiter.api.Test;
import _client_X.backend.BackendConfigX;
import _client_X.pageobject.HomePageX;
import sickag.sickid.lib.ConfigSickID;
import sickag.sickid.pageobject.HomePageSickID;

import static io.restassured.RestAssured.given;

public class ExampleTestX extends _Test {

    private void getThruID() {
        HomePageSickID idHome
                = new HomePageSickID(driver, environment);
        idHome.open();
    }

    @Test
    void frontEndTest() {
        getThruID();
        HomePageX home = new HomePageX(driver);
        home.open();
        home.search("_client_X");
    }

    @Test
    void backendTest() {
        given().contentType(BackendConfigX.backend.getContentType().getValue())
                .formParam(BackendConfigX.backend.getHeaders().get(0).getKey(), BackendConfigX.backend.getHeaders().get(0).getValue())
                .formParam(BackendConfigX.backend.getHeaders().get(1).getKey(), BackendConfigX.backend.getHeaders().get(1).getValue())
                .formParam(BackendConfigX.backend.getHeaders().get(2).getKey(), BackendConfigX.backend.getHeaders().get(2).getValue())
                .when().post(BackendConfigX.backend.getUrl().getValue())
                .then().statusCode(BackendConfigX.backend.getExpectedStatus().getValue());

    }
}
