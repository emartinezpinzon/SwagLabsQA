package starter.login;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class FillData {

    public static Performable onUsernameField(String username) {
        return Task.where("{0} enter standard_user as username",
                Enter.theValue(username)
                        .into(LoginForm.USERNAME_FIELD)
        );
    }

    public static Performable onPasswordField(String password) {
        return Task.where("{0} enter secret_sauce as password",
                Enter.theValue(password)
                        .into(LoginForm.PASSWORD_FIELD)
        );
    }

    public static Performable clickEnterButton() {
        return Task.where("{0} clicks the login button",
                Click.on(LoginForm.LOGIN_BUTTON));
    }
}
