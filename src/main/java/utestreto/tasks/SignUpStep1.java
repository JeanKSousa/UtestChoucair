package utestreto.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.selectactions.SelectByVisibleTextFromTarget;
import utestreto.userinterface.UtestSignUpStep1Page;

public class SignUpStep1 implements Task {
    private String strLastName;
    private String strFirstName;
    private String strEmail;
    private String strMonth;
    private String strDay;
    private String strYear;

    public SignUpStep1(String strLastName, String strFirstName, String strEmail, String strMonth, String strDay, String strYear) {
        this.strLastName = strLastName;
        this.strFirstName = strFirstName;
        this.strEmail = strEmail;
        this.strMonth = strMonth;
        this.strDay = strDay;
        this.strYear = strYear;
    }

    public static SignUpStep1 onThePageStep1(String strFirstName, String strLastName, String strEmail, String strMonth, String strDay, String strYear){
      return Tasks.instrumented(SignUpStep1.class, strFirstName, strLastName, strEmail, strMonth, strDay,strYear);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(UtestSignUpStep1Page.SIGNUP_BUTTON),
                Enter.theValue(strFirstName).into(UtestSignUpStep1Page.INPUT_FIRSTNAME),
                Enter.theValue(strLastName).into(UtestSignUpStep1Page.INPUT_LASTNAME),
                Enter.theValue(strEmail).into(UtestSignUpStep1Page.INPUT_EMAIL),
                new SelectByVisibleTextFromTarget(UtestSignUpStep1Page.SELECT_MONTH,strMonth),
                new SelectByVisibleTextFromTarget(UtestSignUpStep1Page.SELECT_DAY,strDay),
                new SelectByVisibleTextFromTarget(UtestSignUpStep1Page.SELECT_YEAR,strYear),
                Click.on(UtestSignUpStep1Page.NEXT_BUTTON)
        );
    }
}
