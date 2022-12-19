package starter.login;

import net.serenitybdd.screenplay.targets.Target;

public class SwagLabsShop {
    public static final Target HEADER_TITLE =  Target.the("title").locatedBy(".title");
    public static final Target ERROR_CONTAINER = Target.the("error message container").locatedBy(".error-message-container");
}
