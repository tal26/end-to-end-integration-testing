package de.testers.basis.frontend.web;

import com.microsoft.playwright.*;
import de.testers.lib.Url;

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
     */
    public enum BrowserId {
        CHROMIUM,
        WEBKIT,
        FIREFOX;
    }
}
