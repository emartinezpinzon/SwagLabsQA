package starter.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;

public class LoginStepDefinitions {

    @Given("{actor} is on login page")
    public void marianella_is_on_login_page(Actor actor) {
        
    }

    @When("{actor} enter standard_user as username")
    public void she_enter_standard_user_as_username(Actor actor) {

    }

    @When("{actor} enter secret_sauce as password")
    public void she_enter_secret_sauce_as_password(Actor actor) {

    }

    @Then("{actor} should be able to login")
    public void she_should_be_able_to_login(Actor actor) {

    }
}