package starter.pages.headers;

import net.serenitybdd.screenplay.targets.Target;

public class HeadersContent {

    public static final Target HEADER_TITLE = Target.the("title").locatedBy(".title");
    public static final Target CART_ICON = Target.the("cart icon").locatedBy(".shopping_cart_link");
}
