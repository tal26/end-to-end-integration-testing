package mercedes_benz.lib;

import de.testers.lib.Environment;
import de.testers.lib.Url;
import de.testers.lib.User;

public class Config {
    public static User prodUser = new User("x", "x");
    public static User devUser = new User("x", "x");

    public static Url prodUrl = new Url("http://www.google.com");
    public static Url devUrl = new Url("http://www.google.com");

    public static Environment prod = new Environment(prodUrl, prodUser);
    public static Environment dev = new Environment(devUrl, devUser);
}
