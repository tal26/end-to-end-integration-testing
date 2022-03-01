package sickag.sickid.lib;

import de.testers.lib.Environment;
import de.testers.lib.Url;
import sickag.assethub.lib.ConfigAssetHub;

public class ConfigSickID {

    public static Url url = new Url("https://id.sick.com");

    public static Environment production = new Environment(url, ConfigAssetHub.prodUser);

}
