package starter.pages.articledetail;

import net.serenitybdd.screenplay.targets.Target;

public class ArticleDetailForm {
    static Target addToCartButton(){
        return Target.the("add to cart")
                .locatedBy(".btn_inventory")
                .containingText("Add to cart");
    }
}
