package de.testers.functional_testing.frontend.web;

import com.microsoft.playwright.*;
import de.testers.functional_testing.frontend.web.techdepot.AbstractDriverWeb;
import de.testers.lib.Url;
import de.testers.lib.Watch;
import de.testers.lib.XPath;

import java.nio.file.Paths;

public class DriverWeb extends AbstractDriverWeb {

    private Playwright driver;
    private BrowserType browserType;
    private Browser browser;
    private BrowserContext context;
    private Page page;

    private String screenshotsLocation = "reports/screenshots/";

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
    @Override
    public void launchBrowser() {
        browser = browserType.launch();
        context = browser.newContext();
        page = context.newPage();
        //page.navigate("http://www.google.com");
        //System.out.println(page.title());
    }

    @Override
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
    @Override
    public void navigate(Url url) {
        page.navigate(url.getValue());
    }

    /**
     *
     * @return
     */
    @Override
    public String getTitle() {
        return page.title();
    }

    /**
     *
     * @param xpath
     */
    @Override
    public void click(XPath xpath) {
        page.click("xpath=" + xpath.getPath());
    }

    /**
     *
     * @param text
     */
    @Override
    public void fill(XPath xpath, String text) {
        page.fill("xpath=" + xpath.getPath(), text);
    }

    /**
     *
     * @param key
     */
    @Override
    public void sendKeys(SendKeysWeb.Key key) {
        page.keyboard().press(key.getValue());
    }

    /**
     *
     * @return
     */
    @Override
    public String takeScreenshot() {
        String location = screenshotsLocation + Watch.getFilePrefixWithCurrentDateTime() + browserType.name() + ".png";
        page.screenshot(new Page
                .ScreenshotOptions()
                .setPath(Paths.get(location)));
        return location;
    }

    /**
     *
     * @param xPath
     * @return
     */
    @Override
    public boolean wait(XPath xPath) {
        try {
            page.waitForSelector("xpath=" + xPath.getPath());
            return true;
        } catch (Exception e) {}
        return false;
    }


}
