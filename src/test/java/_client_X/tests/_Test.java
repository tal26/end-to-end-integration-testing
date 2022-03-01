package _client_X.tests;

import de.testers.functional_testing.frontend.web.DriverWeb;
import de.testers.functional_testing.frontend.web.ScreenshotWeb;
import de.testers.lib.Environment;
import de.testers.lib.Log;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import sickag.assethub.lib.ConfigAssetHub;
import sickag.sickid.lib.ConfigSickID;

public abstract class _Test {
    protected DriverWeb driver;
    private static DriverWeb operativeDriver;

    protected Environment environment = ConfigSickID.production; //TODO replace by command line config
    protected DriverWeb.BrowserId browserId;

    protected _Test() {
        browserId = DriverWeb.BrowserId.CHROMIUM; //TODO replace by command line config
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
