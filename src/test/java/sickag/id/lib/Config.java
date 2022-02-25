package sickag.id.lib;

import de.testers.lib.Environment;
import de.testers.lib.Url;
import de.testers.lib.User;

public class Config {

    public static Url url = new Url("https://id.sick.com");

    public static Environment productionEnvironment = new Environment(url, sickag.assethub.lib.Config.prodUser);

}
