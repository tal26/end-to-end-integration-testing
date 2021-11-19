package playground;

import de.testers.basis.frontend.web.DriverWeb;
import de.testers.basis.frontend.web.Surf;
import de.testers.lib.Url;
import org.junit.jupiter.api.Test;

public class Try {

    @Test
    void tryTest() {
        DriverWeb driverWeb = new DriverWeb(DriverWeb.BrowserId.CHROMIUM);
        Url url = new Url("http://www.microsoft.com");

        new Surf(driverWeb, url);

    }
}
