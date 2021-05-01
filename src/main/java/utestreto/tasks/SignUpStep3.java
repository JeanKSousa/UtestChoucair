package utestreto.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.selectactions.SelectByVisibleTextFromTarget;
import utestreto.userinterface.UtestSignUpStep1Page;
import utestreto.userinterface.UtestSignUpStep3Page;

public class SignUpStep3 implements Task {
    public static SignUpStep3 onThePageStep3() {
        return Tasks.instrumented(SignUpStep3.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(UtestSignUpStep3Page.NEXT_BUTTON)
        );
    }
}
