package de.testers.basis.frontend.web.techdepot;

import de.testers.basis.frontend.web.SendKeysWeb;
import de.testers.lib.Url;
import de.testers.lib.XPath;

public class SeleniumDriverWeb extends AbstractDriverWeb{
    @Override
    protected void launchBrowser() {

    }

    @Override
    protected void quit() {

    }

    @Override
    protected void navigate(Url url) {

    }

    @Override
    protected String getTitle() {
        return null;
    }

    @Override
    protected void click(XPath xpath) {

    }

    @Override
    protected void fill(XPath xpath, String text) {

    }

    @Override
    protected void sendKeys(SendKeysWeb.Key key) {

    }

    @Override
    protected String takeScreenshot() {
        return null;
    }

    @Override
    protected boolean wait(XPath xPath) {
        return false;
    }
}
