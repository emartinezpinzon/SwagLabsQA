package starter.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.ensure.Ensure;
import starter.pages.articleslist.ArticlesListContent;
import starter.pages.login.LoginFormInteraction;
import starter.pages.login.LoginContent;
import starter.navigation.NavigateTo;

public class LoginStepDefinitions {

    @Given("{actor} is on login page")
    public void navigateToLogin(Actor actor) {
        actor.wasAbleTo(NavigateTo.theSwagLabsLoginPage());
    }

    @When("{actor} enter {string} as username")
    public void inputUsername(Actor actor, String username) {
        actor.attemptsTo(LoginFormInteraction.fillUsernameField(username));
    }

    @When("{actor} enter {string} as password")
    public void inputPassword(Actor actor, String password) {
        actor.attemptsTo(LoginFormInteraction.fillPasswordField(password));
    }

    @When("{actor} clicks the login button")
    public void clickEnter(Actor actor) {
        actor.attemptsTo(LoginFormInteraction.clickLoginButton());
    }

    @Then("{actor} should be able to see the {string}")
    public void validateLogin(Actor actor, String products) {
        actor.attemptsTo(Ensure.that(ArticlesListContent.HEADER_TITLE).hasText(products));
    }

    @Then("{actor} will receive the error message {string}")
    public void validateError(Actor actor, String message) {
        actor.attemptsTo(Ensure.that(LoginContent.ERROR_CONTAINER).hasText(message));
    }
}
