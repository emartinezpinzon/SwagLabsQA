package starter.pages.cartdetail;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import starter.pages.headers.HeadersContent;

public class CartDetailInteraction {
    public static Performable clickOnCheckoutButton() {
        return Task.where("{0} clicks on checkout button",
                Click.on(CartDetailForm.CHECKOUT_BUTTON));
    }
}
