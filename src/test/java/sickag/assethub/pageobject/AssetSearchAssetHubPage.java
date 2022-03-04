package sickag.assethub.pageobject;

import de.testers.functional_testing.frontend.web.DriverWeb;
import de.testers.functional_testing.frontend.web.SurfWeb;
import de.testers.lib.Environment;
import de.testers.lib.Url;
import de.testers.lib.XPath;

public class AssetSearchAssetHubPage extends _AbstractPageAssetHub {
    //private XPath  = new XPath("","");
    private XPath searchField;
    private XPath filterByTrees;
    private XPath filterByLocation;
    private XPath filterByAssetType;
    private XPath filterByVendor;
    private XPath filterByProductNames;
    //TODO table entries
    //TODO paging system

    public AssetSearchAssetHubPage(DriverWeb driverWeb,
                                Environment environment) {
        super(driverWeb);
        this.environment = environment;
        this.baseLink = new Url(environment.url.getValue() + "/search");
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
