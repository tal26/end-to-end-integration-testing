package de.testers.lib;

import de.testers.lib.Url;

public class Environment {
    public Url url;
    public User user;

    public Environment(Url url,
                       User user) {
        this.url = url;
        this.user = user;
    }
}
