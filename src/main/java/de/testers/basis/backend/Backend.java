package de.testers.basis.backend;

import de.testers.basis.backend.lib.Status;
import io.restassured.RestAssured.*;
import io.restassured.matcher.RestAssuredMatchers.*;
import org.hamcrest.Matchers.*;

import de.testers.basis.backend.lib.ContentType;
import de.testers.basis.backend.lib.Header;
import de.testers.lib.Url;

import java.util.List;

import static io.restassured.RestAssured.given;

public class Backend extends AbstractBackend{
    public Backend(Url url,
                   ContentType contentType,
                   List<Header> headers,
                   Status.Code expectedStatus) {
        super(url, contentType, headers, expectedStatus);
    }

    public Url getUrl() {
        return url;
    }

    public ContentType getContentType() {
        return contentType;
    }

    public List<Header> getHeaders() {
        return headers;
    }

    public Status.Code getExpectedStatus() {
        return expectedStatusCode;
    }

    @Override
    protected void login() {
        //TODO
    }
}
