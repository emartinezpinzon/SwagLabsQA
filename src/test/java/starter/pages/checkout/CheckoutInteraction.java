package starter.pages.checkout;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import starter.pages.login.LoginForm;

public class CheckoutInteraction {
    public static Performable fillFirstNameField(String firstName) {
        return Task.where("{0} enter a value as first name",
                Enter.theValue(firstName)
                        .into(CheckoutForm.FIRSTNAME_FIELD)
        );
    }

    public static Performable fillLastNameField(String lastName) {
        return Task.where("{0} enter a value as last name",
                Enter.theValue(lastName)
                        .into(CheckoutForm.LASTNAME_FIELD)
        );
    }

    public static Performable fillPostalCodeField(String postalCode) {
        return Task.where("{0} enter a value as postal code",
                Enter.theValue(postalCode)
                        .into(CheckoutForm.POSTAL_CODE_FIELD)
        );
    }

    public static Performable clickOnContinueButton() {
        return Task.where("{0} continue to confirm purchase",
                Click.on(CheckoutForm.CONTINUE_BUTTON));
    }

}
