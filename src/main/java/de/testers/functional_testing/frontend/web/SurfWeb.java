package de.testers.functional_testing.frontend.web;

import de.testers.lib.Environment;
import de.testers.lib.Log;
import de.testers.lib.Url;

public class SurfWeb extends AbstractWeb {
    private Url url;

    /**
     *
     * @param driverWeb
     * @param url
     */
    public SurfWeb(DriverWeb driverWeb,
                   Url url) {
        super(driverWeb);
        this.url = url;
        Log.print("Surfing to page '" + url.getValue() + "' (Title: '" + driverWeb.getTitle() + "')");
        driverWeb.navigate(url);
    }

    /**
     *
     * @param driverWeb
     * @param environment
     */
    public SurfWeb(DriverWeb driverWeb,
                   Environment environment) {
        this(driverWeb, environment.url);
    }


}
