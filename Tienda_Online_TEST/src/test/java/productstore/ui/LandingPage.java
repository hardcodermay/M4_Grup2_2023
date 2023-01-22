package productstore.ui;

import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

@DefaultUrl("https://www.demoblaze.com/index.html")
public class LandingPage extends PageObject {

    public static final By SIGN_UP_BUTTON = By.id("signin2");
    public static final By USERNAME_FIELD = By.id("sign-username");
    public static final By PASSWORD_FIELD = By.id("sign-password");
    public static final By SIGN_UP_CONFIRMATION_BUTTON = By.xpath("//*[@id='signInModal']/div/div/div[3]/button[2]");

}