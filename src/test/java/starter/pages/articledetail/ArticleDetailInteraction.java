package starter.pages.articledetail;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

public class ArticleDetailInteraction {
    public static Performable clickOnAddToCartButton() {
        return Task.where("{0} clicks on add to cart button",
                Click.on(ArticleDetailForm.addToCartButton()));
    }
}
