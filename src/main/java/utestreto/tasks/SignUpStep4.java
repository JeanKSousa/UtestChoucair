package utestreto.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import utestreto.userinterface.UtestSignUpStep4Page;

public class SignUpStep4 implements Task {
    public static SignUpStep4 onThePageStep4() {
        return Tasks.instrumented(SignUpStep4.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue("PasswordTest12@").into(UtestSignUpStep4Page.IMPUT_PASSWORD),
                Enter.theValue("PasswordTest12@").into(UtestSignUpStep4Page.IMPUT_PASSWORD2),
                Click.on(UtestSignUpStep4Page.CHECK_STAY),
                Click.on(UtestSignUpStep4Page.CHECK_TERMS),
                Click.on(UtestSignUpStep4Page.CHECK_PRIVACY)
                //Click.on(UtestSignUpStep4Page.BUTTON_COMPLETE)
        );
    }
}
