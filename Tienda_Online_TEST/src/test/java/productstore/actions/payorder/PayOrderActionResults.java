package productstore.actions.payorder;

import net.serenitybdd.core.steps.UIInteractionSteps;
import net.thucydides.core.annotations.Step;

public class PayOrderActionResults extends UIInteractionSteps {
    PayOrder payment;
    @Step("")
    public String getPaymentConfirmation() {
        return payment.getAlertMessage();
    }
}
