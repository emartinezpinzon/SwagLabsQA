package starter.pages.articleslist;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.targets.Target;
import starter.pages.login.LoginForm;

public class ArticlesListInteraction {
    public static Performable clickOnArticleName(String article) {
        return Task.where("{0} clicks on any article",
                Click.on(ArticlesListContent.getArticleByName(article)));
    }
}
