package de.testers.base.frontend.web;

import de.testers.lib.Log;

public class SendKeysWeb extends AbstractWeb {
    private Key key;

    public SendKeysWeb(DriverWeb driverWeb,
                       Key key) {
        super(driverWeb);
        this.key = key;
        driverWeb.sendKeys(key);
        Log.print("Sent key '" + key.getValue() + "' to the browser");
    }

    public enum Key {
        //https://playwright.dev/docs/api/class-keyboard/
        ENTER("Enter"),
        ARROW_LEFT("ArrowLeft"),
        SHIFT_A("Shift+A"),
        ESC("Escape");

        private String key;
        Key(String key){
            this.key = key;
        }

        public String getValue() {
            return key;
        }
    }
}
