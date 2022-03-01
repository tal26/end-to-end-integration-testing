package de.testers.functional_testing.frontend.web;

import de.testers.lib.Log;
import de.testers.lib.XPath;

public class ValidateWeb extends AbstractWeb{

    private boolean isExpectedToExist;
    public ValidateWeb(DriverWeb driverWeb,
                       XPath xPath,
                       boolean isExpectedToExist) {
        super(driverWeb, xPath);
        this.isExpectedToExist = isExpectedToExist;

        boolean isAppeared = driverWeb.wait(xPath);

        String message = xPath.toString() + " ('" + xPath.getPath() + "') was expected" + getExpectation();
        if(isAppeared != isExpectedToExist) {
            throw new WebTestFailedException(driverWeb, message);
        } else {
            Log.print(message + ", which indeed was the case.");
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
        if(isExpectedToExist) return " to appear";
        return " not to appear";
    }
}
