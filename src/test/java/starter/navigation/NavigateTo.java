package starter.navigation;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;

public class NavigateTo {
    public static Performable theSwagLabsLoginPage() {
        return Task.where("{0} is on login page",
                Open.browserOn().the(SwagLabsLoginPage.class));
    }
}
