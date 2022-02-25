package sickag.assethub;

import de.testers.functional_testing.frontend.web.DriverWeb;
import de.testers.functional_testing.frontend.web.ScreenshotWeb;
import de.testers.lib.Log;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import sickag.id.lib.Config;
import sickag.id.pageobject.HomePage;

public abstract class AbstractIntegrationTest {
    protected DriverWeb.BrowserId browserId;
    protected DriverWeb driver;
    private static DriverWeb operativeDriver;

    protected AbstractIntegrationTest(DriverWeb.BrowserId browserId) {
        this.browserId = browserId;
        driver = new DriverWeb(browserId);
        operativeDriver = driver;
    }

    @BeforeAll
    public static void rampUp() {
        Log.print("Starting the test");
    }

    @AfterAll
    public static void rampDown() {
        new ScreenshotWeb(operativeDriver);
        operativeDriver.quit();
        Log.print("Finished the test");
    }

}
