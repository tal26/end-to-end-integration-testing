package de.testers.functional_testing.frontend.web.techdepot;

import de.testers.functional_testing.frontend.web.SendKeysWeb;
import de.testers.lib.Url;
import de.testers.lib.XPath;

public abstract class AbstractDriverWeb {
    protected abstract void launchBrowser();
    protected abstract void quit();
    protected abstract void navigate(Url url);
    protected abstract String getTitle();
    protected abstract void click(XPath xpath);
    protected abstract void fill(XPath xpath, String text);
    protected abstract void sendKeys(SendKeysWeb.Key key);
    protected abstract String takeScreenshot();
    protected abstract boolean wait(XPath xPath);

    /**
     *
     */
    public enum BrowserId {
        CHROMIUM,
        WEBKIT,
        FIREFOX;
    }
}
