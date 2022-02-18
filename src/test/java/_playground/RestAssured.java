package _playground;

import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static java.util.concurrent.TimeUnit.MILLISECONDS;

public class RestAssured {

        @Test
        void sampleLoginTest() {
            given().contentType("application/x-www-form-urlencoded; charset")
                    .formParam("grant_type", "password")
                    .formParam("username", "Test User")
                    .formParam("password", "Test123&&")
                    .when().post("http://demo6116845.mockable.io/login")
                    .then().statusCode(200);
        }

    @Test
    public void pathParamTest() {
        given().pathParam("user", "user1")
                .when().get(" http://demo6116845.mockable.io/profile/{user}")
                .then().statusCode(200);
    }

    @Test
    public void queryParamTest() {
        given().queryParam("name", "user1").when().get(" http://demo6116845.mockable.io/profile")
                .then().statusCode(200);
    }

    @Test
    public void formParamTest () {
        given().contentType("application/x-www-form-urlencoded; charset")
                .formParam("grant_type", "password")
                .formParam("username", "Test User")
                .formParam("password", "Test123&&")
                .when().post("http://demo6116845.mockable.io/login")
                .then().statusCode(200);
    }

    @Test
    public void validateStatusCode() {
        given(). when()
                .get("http://demo6116845.mockable.io/statuscheck").then().statusCode(200);
    }

    @Test
    public void MeasureResponseTimeInMilliSeconds() {
        long timeinMilliseconds =  given()
                .when()
                .get("http://demo6116845.mockable.io/statuscheck").timeIn(MILLISECONDS);
        System.out.println("Responce time in miliseconds is" + timeinMilliseconds);
    }
}
