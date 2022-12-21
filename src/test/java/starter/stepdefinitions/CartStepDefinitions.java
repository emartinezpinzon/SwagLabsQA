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

    @When("she clicks on checkout button")
    public void she_clicks_on_checkout_button() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @When("she enter {string} as first name")
    public void she_enter_as_first_name(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @When("she enter {string} as last name")
    public void she_enter_as_last_name(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @When("she enter {string} as postal code")
    public void she_enter_as_postal_code(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @When("she continue to confirm purchase")
    public void she_continue_to_confirm_purchase() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    
    @When("she finish the purchase")
    public void she_finish_the_purchase() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
}
