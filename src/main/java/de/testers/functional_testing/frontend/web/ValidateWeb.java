package de.testers.functional_testing.frontend.web;

import de.testers.lib.XPath;

public class ValidateWeb extends AbstractWeb{

    private boolean isExpectedToExist;
    public ValidateWeb(DriverWeb driverWeb,
                       XPath xPath,
                       boolean isExpectedToExist) {
        super(driverWeb, xPath);
        this.isExpectedToExist = isExpectedToExist;

        boolean isAppeared = driverWeb.wait(xPath);

        if(isAppeared != isAppeared) {
            throw new WebTestFailedException(driverWeb,
                    xPath.toString() + "was expected" + getExpectation());
        }
    }

    public ValidateWeb(DriverWeb driverWeb,
                       XPath xPath) {
        this(driverWeb, xPath, true);
    }

    /**
     *
     * @return
     */
    private String getExpectation() {
        if(isExpectedToExist) return " to appear.";
        return " not to appear.";
    }
}
