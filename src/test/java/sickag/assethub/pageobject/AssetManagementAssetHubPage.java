package sickag.assethub.pageobject;

import de.testers.functional_testing.frontend.web.DriverWeb;
import de.testers.functional_testing.frontend.web.SurfWeb;
import de.testers.lib.Environment;
import de.testers.lib.Url;
import de.testers.lib.XPath;

public class AssetManagementAssetHubPage extends _AbstractPageAssetHub {

    private XPath dropDown = new XPath("Drop down",
            "/html/body/app-root/feature-toggle-provider/app-sick-header/div[2]/div/app-tree-view/app-split-view/app-tree-headline/div/div[1]/div/app-tree-selector/div/p-dropdown/div/span/div");
    private XPath searchField = new XPath("Search field",
                                       "//*[@id='tree-search-field']/span");
    /* */
    private XPath tabAssetManagement = new XPath("Asset Management tab",
                                       "/html/body/app-root/feature-toggle-provider/app-sick-header/div[2]/div/app-tree-view/app-split-view/div/as-split/as-split-area[2]/div/app-asset-view-navigation/div/p-tabmenu/div/ul/li[1]/a/span");

    private XPath tabAssetManagementNotes = new XPath("Notes (Asset Management tab)",
                                       "//*[@id='p-accordiontab-0']/span[2]");

    private XPath tabAssetManagementHistory = new XPath("History (Asset Management tab)",
                                       "//*[@id='p-accordiontab-1']/span[2]");

    private XPath tabAssetManagementLocation = new XPath("Location (Asset Management tab)",
                                       "//*[@id='p-accordiontab-2']/span[2]");

    private XPath tabAssetManagementPermission = new XPath("Permission (Asset Management tab)",
                                       "//*[@id='p-accordiontab-3']/span[2]");

    private XPath tabAssetManagementImagesAndTechnicalDrawings = new XPath("Images And Technical Drawings (Asset Management tab)",
                                       "//*[@id='p-accordiontab-4']/span[2]");

    private XPath tabAssetManagementDocuments = new XPath("Documents (Asset Management tab)",
                                       "//*[@id='p-accordiontab-5']/span[2]");

    private XPath tabAssetManagementCustomLinks = new XPath("Custom links (Asset Management tab)",
                                       "//*[@id='p-accordiontab-6']/span[2]");

    private XPath tabAssetManagementMenuDropDown = new XPath("Menu Dropdown (Asset Management tab)",
                                       "//*[@id='option-expandable-menu\"]/div/app-menu/span");


    /* */
    private XPath tabLiveConnect = new XPath("Live Connect tab",
                                       "/html/body/app-root/feature-toggle-provider/app-sick-header/div[2]/div/app-tree-view/app-split-view/div/as-split/as-split-area[2]/div/app-asset-view-navigation/div/p-tabmenu/div/ul/li[2]/a/span");


    public AssetManagementAssetHubPage(DriverWeb driverWeb,
                                       Environment environment) {
        super(driverWeb);
        this.environment = environment;
        this.baseLink = new Url(environment.url.getValue() + "/asset");
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
