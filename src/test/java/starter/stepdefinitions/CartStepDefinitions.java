package starter.stepdefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.ensure.Ensure;
import starter.pages.articledetail.ArticleDetailInteraction;
import starter.pages.articleslist.ArticlesListForm;
import starter.pages.articleslist.ArticlesListInteraction;
import starter.pages.cartdetail.CartDetailInteraction;
import starter.pages.checkout.CheckoutInteraction;
import starter.pages.headers.HeadersContent;
import starter.pages.headers.HeadersInteraction;

public class CartStepDefinitions {
    @When("{actor} clicks on {string} article")
    public void clickOnArticle(Actor actor, String article) {
        actor.attemptsTo(ArticlesListInteraction.clickOnArticleName(article));
    }

    @When("{actor} clicks on add to cart button")
    public void clickOnAddToCartButton(Actor actor) {
        actor.attemptsTo(ArticleDetailInteraction.clickOnAddToCartButton());
    }

    @When("{actor} clicks on cart icon")
    public void clickOnCartIcon(Actor actor) {
        actor.attemptsTo(HeadersInteraction.clickOnCartIcon());
    }

    @Then("{actor} should be to see her cart")
    public void validateCartView(Actor actor) {
        actor.attemptsTo(Ensure.that(HeadersContent.HEADER_TITLE).hasText("YOUR CART"));
    }

    @Then("{actor} should be to see {string} article")
    public void validateArticleOnCart(Actor actor, String article) {
        actor.attemptsTo(Ensure.that(ArticlesListForm.getArticleByName(article)).hasText(article));
    }

    @When("{actor} clicks on checkout button")
    public void clickOnCheckoutButton(Actor actor) {
        actor.attemptsTo(CartDetailInteraction.clickOnCheckoutButton());
    }

    @When("{actor} enter {string} as first name")
    public void inputFirstName(Actor actor, String firstName) {
        actor.attemptsTo(CheckoutInteraction.fillFirstNameField(firstName));
    }

    @When("{actor} enter {string} as last name")
    public void inputLastName(Actor actor, String lastName) {
        actor.attemptsTo(CheckoutInteraction.fillLastNameField(lastName));
    }

    @When("{actor} enter {string} as postal code")
    public void inputPostalCode(Actor actor, String postalCode) {
        actor.attemptsTo(CheckoutInteraction.fillPostalCodeField(postalCode));
    }

    @When("{actor} continue to confirm purchase")
    public void clickOnContinueButton(Actor actor) {
        actor.attemptsTo(CheckoutInteraction.clickOnContinueButton());
    }

    @When("{actor} finish the purchase")
    public void clickOnFinishPurchaseButton(Actor actor) {

    }
}
