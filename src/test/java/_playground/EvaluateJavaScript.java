package _playground;

import com.microsoft.playwright.*;
import org.junit.jupiter.api.Test;

public class EvaluateJavaScript {
    @Test
    void evaluateTest() {
        try (Playwright playwright = Playwright.create()) {
            Browser browser = playwright.firefox().launch();
            BrowserContext context = browser.newContext();
            Page page = context.newPage();
            page.navigate("https://www.example.com/");
            Object dimensions = page.evaluate("() => {\n" +
                    "  return {\n" +
                    "      width: document.documentElement.clientWidth,\n" +
                    "      height: document.documentElement.clientHeight,\n" +
                    "      deviceScaleFactor: window.devicePixelRatio\n" +
                    "  }\n" +
                    "}");
            System.out.println(dimensions);
        }
    }
}
