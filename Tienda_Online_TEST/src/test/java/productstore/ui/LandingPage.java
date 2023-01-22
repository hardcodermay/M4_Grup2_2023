package productstore.ui;

import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

@DefaultUrl("https://www.demoblaze.com/index.html")
public class LandingPage extends PageObject {

    //SignUp Controls
    public static final By SIGNUP_BUTTON = By.id("signin2");
    public static final By SIGNUP_USERNAME_FIELD = By.id("sign-username");
    public static final By SIGNUP_PASSWORD_FIELD = By.id("sign-password");
    public static final By SIGNUP_CONFIRMATION_BUTTON = By.xpath("//*[@id='signInModal']/div/div/div[3]/button[2]");

    //Login Controls
    public static final By LOGIN_BUTTON = By.id("login2");
    public static final By LOGIN_USERNAME_FIELD = By.id("loginusername");
    public static final By LOGIN_PASSWORD_FIELD = By.id("loginpassword");
    public static final By LOGIN_CONFIRMATION_BUTTON = By.xpath("//*[@id='logInModal']/div/div/div[3]/button[2]");

    //User Controls
    public static final By USER_NAME_LABEL = By.id("nameofuser");

}