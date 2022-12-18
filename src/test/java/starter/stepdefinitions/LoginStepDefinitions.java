package starter.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import starter.navigation.NavigateTo;

public class LoginStepDefinitions {

    @Given("{actor} is on login page")
    public void navigateToLogin(Actor actor) {
        actor.wasAbleTo(NavigateTo.theSwagLabsLoginPage());
    }

    @When("{actor} enter standard_user as username")
    public void inputUsername(Actor actor) {

    }

    @When("{actor} enter secret_sauce as password")
    public void inputPassword(Actor actor) {

    }

    @Then("{actor} should be able to login")
    public void validateLogin(Actor actor) {

    }
}
