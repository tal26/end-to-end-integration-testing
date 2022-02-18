package sickag.id.lib;

import de.testers.lib.Environment;
import de.testers.lib.Url;
import de.testers.lib.User;

public class Config {
    public static User prodUser = new User("tal@testers.de", "Sobaka$1");
    public static User devUser = new User("test216a.assethub@sick.de", 'g\"kwcY\"^h3Xg}ma~[9Mh");

    public static Url prodUrl = new Url("http://assethub.cloud.sick.com");
    public static Url devUrl = new Url("http://dev.sick.ag.cloud");

    public static Environment prod = new Environment(prodUrl, prodUser);
    public static Environment dev = new Environment(devUrl, devUser);
}
