package starter.pages.headers;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

public class HeadersInteraction {
    public static Performable clickOnCartIcon() {
        return Task.where("{0} clicks on cart icon",
                Click.on(HeadersContent.CART_ICON));
    }
}
