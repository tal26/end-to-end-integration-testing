package de.testers.functional_testing.backend;

import de.testers.functional_testing.backend.lib.ContentType;
import de.testers.functional_testing.backend.lib.Header;
import de.testers.functional_testing.backend.lib.Status;
import de.testers.lib.Url;

import java.util.List;

public abstract class AbstractBackend {
    protected Url url;
    protected ContentType contentType;
    protected List<Header> headers;
    protected Status.Code expectedStatusCode;

    protected AbstractBackend(Url url,
                              ContentType contentType,
                              List<Header> headers,
                              Status.Code expectedStatusCode) {
        this.url = url;
        this.contentType = contentType;
        this.headers = headers;
        this.expectedStatusCode = expectedStatusCode;
    }



    protected abstract void login();
}
