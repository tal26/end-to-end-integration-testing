package de.testers.basis.frontend.web;

import de.testers.lib.Url;

public class Surf {
    private DriverWeb driverWeb;
    private Url url;

    /**
     *
     * @param driverWeb
     * @param url
     */
    public Surf(DriverWeb driverWeb, Url url) {
        this.driverWeb = driverWeb;
        this.url = url;
        driverWeb.navigate(url);
    }


}
