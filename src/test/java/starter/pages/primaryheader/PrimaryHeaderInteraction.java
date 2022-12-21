package starter.pages.primaryheader;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import starter.pages.login.LoginForm;

public class PrimaryHeaderInteraction {
    public static Performable clickOnCartIcon() {
        return Task.where("{0} clicks on cart icon",
                Click.on(PrimaryHeaderContent.CART_ICON));
    }
}
