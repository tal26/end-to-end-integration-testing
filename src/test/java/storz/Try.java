package storz;

import de.testers.basis.frontend.web.*;
import org.junit.jupiter.api.Test;
import storz.pageobject.HomePage;

public class Try extends AbstractIntegrationTest {
    Try() {
        super(DriverWeb.BrowserId.CHROMIUM);
    }

    @Test
    void tryTest() {
        HomePage home = new HomePage(driver);
        home.open();
        home.search("storz");

        new ScreenshotWeb(driver);
        driver.quit();
    }
}
