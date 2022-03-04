package sickag.sickid.pageobject;

import de.testers.functional_testing.frontend.web.*;
import de.testers.lib.Environment;
import de.testers.lib.XPath;

public class HomePageSickID extends _AbstractPageSickID {
    private Environment environment;

    private XPath cookiesPopup = new XPath("Cookies Popup", "//*[@id='gdpr_modal_wrapper']/div[1]");
    private XPath agreeButton = new XPath("Agree button", "//*[@id='gdpr_modal_button_consent']");
    private XPath userNameField = new XPath("User name field", "//*[@id='username-input']");
    private XPath userPasswordField = new XPath("User password field", "//*[@id='password-input']");
    private XPath rememberMeCheckBox = new XPath("Remember me checkbox", "//*[@id='rememberMe']");
    private XPath loginButton = new XPath("Login button", "//*[@id='kc-login']");


    public HomePageSickID(DriverWeb driverWeb,
                          Environment environment) {
        super(driverWeb);
        this.environment = environment;
    }

    public void open() {
        new SurfWeb(driverWeb, environment);
        agreeToCookies();
        login();
    }

    /**
     *
     */
    private void agreeToCookies() {
        new ClickWeb(driverWeb, agreeButton);
    }

    /**
     *
     */
    private void login() {
        new FillWeb(driverWeb, userNameField, environment.user.loginName);
        new FillWeb(driverWeb, userPasswordField, environment.user.pwd);
        new ClickWeb(driverWeb, rememberMeCheckBox);
        new ClickWeb(driverWeb, loginButton);
    }

    @Override
    protected void makeSure() {
        new ValidateWeb(driverWeb, cookiesPopup);
    }
}
