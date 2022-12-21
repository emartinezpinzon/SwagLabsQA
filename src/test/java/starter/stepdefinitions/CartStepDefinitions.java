package starter.stepdefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.ensure.Ensure;
import starter.pages.articledetail.ArticleDetailInteraction;
import starter.pages.articleslist.ArticlesListForm;
import starter.pages.articleslist.ArticlesListInteraction;
import starter.pages.headers.HeadersContent;
import starter.pages.headers.HeadersInteraction;

public class CartStepDefinitions {
    @When("{actor} clicks on {string} article")
    public void clickOnArticle(Actor actor, String article) {
        actor.attemptsTo(
                ArticlesListInteraction.clickOnArticleName(article)
        );
    }

    @When("{actor} clicks on add to cart button")
    public void clickOnAddToCartButton(Actor actor) {
        actor.attemptsTo(
                ArticleDetailInteraction.clickOnAddToCartButton()
        );
    }

    @When("{actor} clicks on cart icon")
    public void clickOnCartIcon(Actor actor) {
        actor.attemptsTo(
                HeadersInteraction.clickOnCartIcon()
        );
    }

    @Then("{actor} should be to see her cart")
    public void validateCartView(Actor actor) {
        actor.attemptsTo(Ensure.that(HeadersContent.HEADER_TITLE).hasText("YOUR CART"));
    }

    @Then("{actor} should be to see {string} article")
    public void validateArticleOnCart(Actor actor, String article) {
        actor.attemptsTo(Ensure.that(ArticlesListForm.getArticleByName(article)).hasText(article));
    }
}
