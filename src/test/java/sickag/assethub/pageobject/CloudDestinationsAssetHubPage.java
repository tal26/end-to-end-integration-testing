package sickag.assethub.pageobject;

import de.testers.functional_testing.frontend.web.DriverWeb;
import de.testers.functional_testing.frontend.web.SurfWeb;
import de.testers.lib.Environment;
import de.testers.lib.Url;

public class CloudDestinationsAssetHubPage extends _AbstractPageAssetHub{
    //TODO add objects

    public CloudDestinationsAssetHubPage(DriverWeb driverWeb,
                                Environment environment) {
        super(driverWeb);
        this.environment = environment;
        this.baseLink = new Url(environment.url.getValue() + "/liveconnect");
    }

    @Override
    public void open() {
        new SurfWeb(driverWeb, baseLink);
        makeSure();
    }

    @Override
    protected void makeSure() {
        //TODO
    }
}
