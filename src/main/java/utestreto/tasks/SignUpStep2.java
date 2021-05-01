package utestreto.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import utestreto.userinterface.UtestSignUpStep2Page;

public class SignUpStep2 implements Task {

    public static SignUpStep2 onThePageStep2() {
        return Tasks.instrumented(SignUpStep2.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(

                Enter.theValue("Veracruz, Panama").into(UtestSignUpStep2Page.INPUT_CITY),
                Enter.theValue("507").into(UtestSignUpStep2Page.INPUT_POSTAL),
                Click.on(UtestSignUpStep2Page.NEXT_BUTTON)
        );
    }
}
