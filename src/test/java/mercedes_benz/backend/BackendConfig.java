package mercedes_benz.backend;

import de.testers.functional_testing.backend.Backend;
import de.testers.functional_testing.backend.lib.ContentType;
import de.testers.functional_testing.backend.lib.Header;
import de.testers.functional_testing.backend.lib.Status;
import de.testers.lib.Url;

import java.util.ArrayList;
import java.util.List;

public class BackendConfig {
    private static Url url = new Url("http://demo6116845.mockable.io/login");
    private static ContentType contentType = new ContentType("application/x-www-form-urlencoded; charset");
    private static List<Header> getHeaders() {
        List<Header> headers = new ArrayList<Header>();
        headers.add(new Header("grant_type","password"));
        headers.add(new Header("username", "Test User"));
        headers.add(new Header("password", "Test123&&"));
        return headers;
    }

    public static Backend backend = new Backend(url,
            contentType,
            getHeaders(),
            Status.Code.OK_200);
}
