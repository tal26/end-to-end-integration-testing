package de.testers.base.backend;

import de.testers.base.backend.lib.Status;

import de.testers.base.backend.lib.ContentType;
import de.testers.base.backend.lib.Header;
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
