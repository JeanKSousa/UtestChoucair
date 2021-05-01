package utestreto.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class UtestSignUpStep4Page {
    public static final Target IMPUT_PASSWORD = Target.the("where do we write the password")
            .located(By.id("password"));

    public static final Target IMPUT_PASSWORD2 = Target.the("where do we write the password again")
            .located(By.id("confirmPassword"));

    public static final Target CHECK_STAY = Target.the("where do we check 1")
            .located(By.xpath("//div[@class='signup-consent__text--highlight']"));

    public static final Target CHECK_TERMS = Target.the("where do we check 1")
            .located(By.id("termOfUse"));

    public static final Target CHECK_PRIVACY = Target.the("where do we check 1")
            .located(By.id("privacySetting"));

    public static final Target BUTTON_COMPLETE = Target.the("where do we check 1")
            .located(By.xpath("//div[@class='pull-right next-step']//a"));

}
