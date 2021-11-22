package storz;

import de.testers.basis.frontend.web.*;
import org.junit.jupiter.api.Test;
import storz.pageobject.Home;

public class Try extends IntegrationTest{
    Try() {
        super(DriverWeb.BrowserId.CHROMIUM);
    }

    @Test
    void tryTest() {
        Home home = new Home(driver);
        home.open();
        home.search("storz");

        driver.quit();
    }
}
