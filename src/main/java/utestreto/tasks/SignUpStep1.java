package utestreto.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.selectactions.SelectByVisibleTextFromTarget;
import utestreto.userinterface.UtestSignUpStep1Page;

public class SignUpStep1 implements Task {

    public static SignUpStep1 onThePageStep1(){
      return Tasks.instrumented(SignUpStep1.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(UtestSignUpStep1Page.SIGNUP_BUTTON),
                Enter.theValue("Maria").into(UtestSignUpStep1Page.INPUT_FIRSTNAME),
                Enter.theValue("Solis").into(UtestSignUpStep1Page.INPUT_LASTNAME),
                Enter.theValue("maria.solis@test.com").into(UtestSignUpStep1Page.INPUT_EMAIL),
                new SelectByVisibleTextFromTarget(UtestSignUpStep1Page.SELECT_MONTH,"December"),
                new SelectByVisibleTextFromTarget(UtestSignUpStep1Page.SELECT_DAY,"6"),
                new SelectByVisibleTextFromTarget(UtestSignUpStep1Page.SELECT_YEAR,"1996"),
                Click.on(UtestSignUpStep1Page.NEXT_BUTTON)
        );
    }
}
