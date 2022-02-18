package _playground;

import com.microsoft.playwright.*;
import org.junit.jupiter.api.Test;

import java.nio.file.Paths;

import static java.util.Arrays.asList;

public class GeoLocation {
    @Test
    void locationTest() {
        try (Playwright playwright = Playwright.create()) {
            Browser browser = playwright.chromium().launch();
            BrowserContext context = browser.newContext(new Browser.NewContextOptions()
                    .setUserAgent("Mozilla/5.0 (Linux; Android 8.0; Pixel 2 Build/OPD3.170816.012) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/75.0.3765.0 Mobile Safari/537.36")
                    .setViewportSize(411, 731)
                    .setDeviceScaleFactor(2.625)
                    .setIsMobile(true)
                    .setHasTouch(true)
                    .setLocale("en-US")
                    .setGeolocation(41.889938, 12.492507)
                    .setPermissions(asList("geolocation")));
            Page page = context.newPage();
            page.navigate("https://www.openstreetmap.org/");
            page.click("a[data-original-title=\"Show My Location\"]");
            page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("colosseum-pixel2.png")));
        }
    }
}