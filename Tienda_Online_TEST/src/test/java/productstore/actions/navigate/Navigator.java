package productstore.actions.navigate;

import net.thucydides.core.annotations.Step;
import productstore.ui.LandingPage;

public class Navigator {
    LandingPage landing;
    @Step("")
    public void toLandingPage() {
        landing.open();
    }
}
