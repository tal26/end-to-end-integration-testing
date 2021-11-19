package playground;

import com.microsoft.playwright.*;
import org.junit.jupiter.api.Test;

public class InterceptNetworkRequests {
    @Test
    void interceptTest() {
        try (Playwright playwright = Playwright.create()) {
            Browser browser = playwright.webkit().launch();
            BrowserContext context = browser.newContext();
            Page page = context.newPage();
            page.route("**", route -> {
                System.out.println(route.request().url());
                route.resume();
            });
            page.navigate("http://todomvc.com");
        }
    }
}
