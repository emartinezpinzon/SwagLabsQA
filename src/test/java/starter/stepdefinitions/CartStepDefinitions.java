package starter.stepdefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import starter.pages.articledetail.ArticleDetailInteraction;
import starter.pages.articleslist.ArticlesListInteraction;

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

    }

    @Then("{actor} should be to see her cart")
    public void validateCartView(Actor actor) {

    }

    @Then("{actor} should be to see {string} article")
    public void validateArticleOnCart(Actor actor, String article) {

    }
}
