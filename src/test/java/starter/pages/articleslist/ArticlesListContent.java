package starter.pages.articleslist;

import net.serenitybdd.screenplay.targets.Target;

public class ArticlesListContent {
    public static final Target HEADER_TITLE = Target.the("title").locatedBy(".title");

    static Target getArticleByName(String articleName) {
        return Target.the("article name")
                .locatedBy(".inventory_item_name")
                .containingText(articleName);
    }
}
