package starter.stepdefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;

public class CartStepDefinitions {
    @When("{actor} clicks on {string} article")
    public void clickOnArticle(Actor actor, String article) {

    }

    @When("{actor} clicks on add to cart button")
    public void clickOnAddToCartButton(Actor actor) {

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
