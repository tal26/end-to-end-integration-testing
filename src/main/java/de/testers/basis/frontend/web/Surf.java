package de.testers.basis.frontend.web;

import de.testers.lib.Log;
import de.testers.lib.Url;

public class Surf extends AbstractWeb {
    private Url url;

    /**
     *
     * @param driverWeb
     * @param url
     */
    public Surf(DriverWeb driverWeb, Url url) {
        super(driverWeb);
        this.url = url;
        driverWeb.navigate(url);

        Log.print("Surfed to page '" + url.get() + "' (Title: '" + driverWeb.getTitle() + "')");
    }


}
