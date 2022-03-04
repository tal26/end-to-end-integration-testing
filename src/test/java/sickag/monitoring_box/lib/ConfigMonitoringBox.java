package sickag.monitoring_box.lib;

import de.testers.lib.Environment;
import de.testers.lib.Url;
import de.testers.lib.User;

public class ConfigMonitoringBox {
    public static User prodUser = new User("tal@testers.de", "Sobaka$1"); //TODO
    //public static User devUser = new User("test216a.assethub@sick.de", "g\"kwcY\"^h3Xg}ma~[9Mh"); //TODO

    public static Url prodUrl = new Url("https://smartservice.sick.com/de/devices"); //TODO
    //public static Url devUrl = new Url("http://dev.sick.ag.cloud"); //TODO

    public static Environment prod = new Environment(prodUrl, prodUser);
    //public static Environment dev = new Environment(devUrl, devUser);
}
