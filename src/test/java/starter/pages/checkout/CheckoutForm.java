package starter.pages.checkout;

import net.serenitybdd.screenplay.targets.Target;

public class CheckoutForm {

    static Target FIRSTNAME_FIELD = Target.the("first name field").locatedBy("#first-name");
    static Target LASTNAME_FIELD = Target.the("last name field").locatedBy("#last-name");
    static Target POSTAL_CODE_FIELD = Target.the("postal code field").locatedBy("#postal-code");
    static Target CONTINUE_BUTTON = Target.the("continue button").locatedBy("#continue");

}
