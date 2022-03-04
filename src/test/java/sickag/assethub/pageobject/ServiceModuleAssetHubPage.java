package sickag.assethub.pageobject;

import de.testers.functional_testing.frontend.web.DriverWeb;
import de.testers.functional_testing.frontend.web.SurfWeb;
import de.testers.lib.Environment;
import de.testers.lib.Url;

public class ServiceModuleAssetHubPage extends _AbstractPageAssetHub{

    //TODO objects
    public ServiceModuleAssetHubPage(DriverWeb driverWeb,
                                Environment environment) {
        super(driverWeb);
        this.environment = environment;
        this.baseLink = new Url(environment.url.getValue() + "/"); //TODO
    }

    @Override
    public void open() {
        //new SurfWeb(driverWeb, baseLink);
        makeSure();
    }

    @Override
    protected void makeSure() {
        //TODO
    }
}
