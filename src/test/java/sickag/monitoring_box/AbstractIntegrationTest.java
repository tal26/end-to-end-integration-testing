package sickag.monitoring_box;

import de.testers.basis.frontend.web.DriverWeb;
import de.testers.lib.Log;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;

public abstract class AbstractIntegrationTest {
    protected DriverWeb.BrowserId browserId;
    protected DriverWeb driver;

    protected AbstractIntegrationTest(DriverWeb.BrowserId browserId) {
        this.browserId = browserId;
        driver = new DriverWeb(browserId);
    }

    @BeforeAll
    public static void rampUp() {
        Log.print("Starting the test");
    }

    @AfterAll
    public static void rampDown() {
        Log.print("Finished the test");
    }

}