package de.testers.basis.frontend.web;

import com.microsoft.playwright.*;
import de.testers.lib.Url;
import de.testers.lib.Watch;
import de.testers.lib.XPath;

import java.nio.file.Paths;

public class DriverWeb {
    private Playwright driver;
    private BrowserType browserType;
    private Browser browser;
    private BrowserContext context;
    private Page page;

    /**
     *
     * @param browserId
     */
    public DriverWeb(BrowserId browserId) {

        driver = Playwright.create();
        setBrowserType(browserId);
        launchBrowser();
    }

    /**
     *
     */
    private void launchBrowser() {
        browser = browserType.launch();
        context = browser.newContext();
        page = context.newPage();
        //page.navigate("http://www.google.com");
        //System.out.println(page.title());
    }

    public void quit() {
        page.close();
        context.close();
        browser.close();
    }

    /**
     *
     * @param browserId
     */
    private void setBrowserType(BrowserId browserId) {
        switch (browserId) {
            case CHROMIUM -> browserType = driver.chromium();
            case WEBKIT -> browserType = driver.webkit();
            case FIREFOX -> browserType = driver.firefox();
        }
    }

    /**
     *
     * @param url
     */
    public void navigate(Url url) {
        page.navigate(url.get());
    }

    /**
     *
     * @return
     */
    public String getTitle() {
        return page.title();
    }

    /**
     *
     * @param xpath
     */
    public void click(XPath xpath) {
        page.click("xpath=" + xpath.getPath());
    }

    /**
     *
     * @param text
     */
    public void fill(XPath xpath, String text) {
        page.fill("xpath=" + xpath.getPath(), text);
    }

    /**
     *
     * @param key
     */
    public void sendKeys(SendKeys.Key key) {
        page.keyboard().press(key.getValue());
    }

    public String takeScreenshot() {
        String location = Watch.getFilePrefixWithCurrentDateTime() + "screenshot-" + browserType.name() + ".png";
        page.screenshot(new Page
                .ScreenshotOptions()
                .setPath(Paths.get(location)));
        return location;
    }

    /**
     *
     */
    public enum BrowserId {
        CHROMIUM,
        WEBKIT,
        FIREFOX;
    }
}
