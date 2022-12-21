package starter.pages.login;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class LoginFormInteraction {

    public static Performable fillUsernameField(String username) {
        return Task.where("{0} enter standard_user as username",
                Enter.theValue(username)
                        .into(LoginForm.USERNAME_FIELD)
        );
    }

    public static Performable fillPasswordField(String password) {
        return Task.where("{0} enter secret_sauce as password",
                Enter.theValue(password)
                        .into(LoginForm.PASSWORD_FIELD)
        );
    }

    public static Performable clickLoginButton() {
        return Task.where("{0} clicks the login button",
                Click.on(LoginForm.LOGIN_BUTTON));
    }
}
