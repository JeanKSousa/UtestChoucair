package utestreto.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import utestreto.userinterface.UtestSignUpStep2Page;

public class SignUpStep2 implements Task {
    private String strCity;
    private String strPostal;

    public SignUpStep2(String strCity, String strPostal) {
        this.strCity = strCity;
        this.strPostal = strPostal;
    }

    public static SignUpStep2 onThePageStep2(String strCity, String strPostal) {
        return Tasks.instrumented(SignUpStep2.class, strCity, strPostal);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(

                Enter.theValue(strCity).into(UtestSignUpStep2Page.INPUT_CITY),
                Enter.theValue(strPostal).into(UtestSignUpStep2Page.INPUT_POSTAL),
                Click.on(UtestSignUpStep2Page.NEXT_BUTTON)
        );
    }
}
