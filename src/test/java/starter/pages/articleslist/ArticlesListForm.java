package starter.pages.articleslist;

import net.serenitybdd.screenplay.targets.Target;

public class ArticlesListForm {
    public static Target getArticleByName(String articleName) {
        return Target.the("article name")
                .locatedBy(".inventory_item_name")
                .containingText(articleName);
    }
}
